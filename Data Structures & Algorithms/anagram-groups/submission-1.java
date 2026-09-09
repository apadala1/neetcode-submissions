class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        Map<String , List<String>> map = new HashMap<>();

        for (var str : strs){

            map.computeIfAbsent(hashCode(str) , k -> new ArrayList()).add(str);
        }

        return new ArrayList<>(map.values());
    }

    public String hashCode(String str) {

        char[] array = new char[26];

        for ( int i= 0 ; i< str.length() ; i++) {

            char ch = str.charAt(i);
            array[ch -'a']++;
        }

        return Arrays.toString(array);
    }
}

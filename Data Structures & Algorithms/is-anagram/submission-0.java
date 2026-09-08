class Solution {
    public boolean isAnagram(String s, String t) {

        Map<Character,Integer> sMap = new HashMap<>();
        Map<Character,Integer> tMap = new HashMap<>();


        if ( s.length() != t.length())
        {
            return false;
        }

        for (int i = 0 ; i< s.length() ; i++) {

            var sChar = s.charAt(i);
            var tChar = t.charAt(i);

            sMap.put(sChar , sMap.getOrDefault(sChar,0) +1 );

            tMap.put(tChar , tMap.getOrDefault(tChar,0) +1 );
        }

        return tMap.equals(sMap) ;
    }
}

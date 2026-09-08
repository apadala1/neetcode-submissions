class Solution {
    public boolean hasDuplicate(int[] nums) {
        
        Set<Integer> integerSet = new HashSet<>();

        for ( var num : nums) {

            if(!integerSet.add(num)){
                return true;
            }
        }

        return false;
    }
}
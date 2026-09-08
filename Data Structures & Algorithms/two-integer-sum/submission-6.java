class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer ,Integer> map = new HashMap<>(nums.length);

        for (int i = 0 ; i < nums.length ; i++ ) {

            var targetValue = target - nums[i]; 

            if ( map.containsKey(targetValue)) {

                int index = map.get(targetValue);

                return new int[] {index , i};
            }
            else{

                map.put(nums[i] ,i);
            }
        }
        return new int[]{};
    }
}

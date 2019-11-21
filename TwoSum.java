class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        //Create a hashmap of integers
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            
            //Create a value and check to see if it's in the map
            int val = target - nums[i];
            if(map.containsKey(val)){
                return new int[] {
                    map.get(val), i 
                };
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}

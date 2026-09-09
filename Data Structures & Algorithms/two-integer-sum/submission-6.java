class Solution {
    public int[] twoSum(int[] nums, int target) {
        //return the smaller index first
        HashMap<Integer, Integer> map = new HashMap<>();//Remainder, Index
        //0,4 1
        //0,6 

        for(int i=0;i<nums.length;i++){
            
            if(map.get(nums[i])!=null){
                return new int[]{map.get(nums[i]), i};
            }
            map.put(target-nums[i], i);
        }
        return null;
    }
}

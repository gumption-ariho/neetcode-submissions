class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer>hashy = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int remainder = target-nums[i];
            if(hashy.containsKey(remainder)){
                return new int[]{hashy.get(remainder),i};
            }else{
                hashy.put(nums[i],i);
            }
        }
        return null;
    }
}

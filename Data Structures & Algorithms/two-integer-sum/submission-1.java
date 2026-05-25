class Solution {
    public int[] twoSum(int[] nums, int target) {
        //storing elem in a set
        HashMap<Integer,Integer>setty = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int compliment=target-nums[i];
            if(setty.containsKey(compliment)){
                return new int[]{setty.get(compliment),i};
            }
            setty.put(nums[i],i);
        }
        return null;
    }
}

class Solution {
    public int[] twoSum(int[] nums, int target) {
        //O(n) so no sorting
        //return index. HashMap (diff, index)
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                return new int[]{map.get(nums[i]), i};
            }
            int diff = target - nums[i];
            map.put(diff, i);
        }
        return null;
    }
}

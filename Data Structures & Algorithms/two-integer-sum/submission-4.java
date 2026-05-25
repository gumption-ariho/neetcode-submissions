class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer>map = new HashMap<>();
        for(int i= 0;i<nums.length;i++){
            int balance = target-nums[i];

            if(map.containsKey(balance)){
                System.out.println("hERE IS THIS " + balance + " " + i + " " + nums[i]);
                return new int[]{map.get(balance),i};
            }
            //3,0 4,1 5,2 6,3
            map.put(nums[i],i);
        }
        return null;
    }
}

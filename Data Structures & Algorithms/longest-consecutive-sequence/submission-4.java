class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        HashSet<Integer> set = new  HashSet<>();
        for(int i:nums){
            set.add(i);
        }
        int max=1;
        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i]+1)){
                continue;
            }else{
                int seq=1;
                int x=nums[i];
                while(set.contains(x-1)){
                    seq++;
                    x--;
                }
                max=Math.max(max,seq);
            }
        }
        return max;
    }
}

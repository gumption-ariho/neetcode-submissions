class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> listy = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){
            
            
            int k=nums.length-1;
            if(i>0&&nums[i]==nums[i-1]){
                continue;
            }
            int remainder = 0-nums[i];
            int j=i+1;
            while(j<k){
                
                if(nums[j]+nums[k]==remainder){
                    listy.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    j++;
                    k--;
                    while(j<k && nums[j]==nums[j-1]){
                    j++;}
                    while(k>j && k<nums.length-1 && nums[k]==nums[k+1]){
                    k--;}
                }else 
                if(nums[j]+nums[k]<remainder){
                    j++;
                } else
                if(nums[j]+nums[k]>remainder){
                    k--;
                }
            }
        }
        return listy;
    }
}

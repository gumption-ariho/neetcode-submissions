class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
       //sort

       //0   1   2   3  4
       //*   *          *
       Arrays.sort(nums);
       int n = nums.length;
       List<List<Integer>> list1 = new ArrayList<>();
        for(int i=0;i<n-2;i++){
            while(i!=0 && i<n-2 && nums[i]==nums[i-1]){
                i++;
            }
            int j=i+1;
            int k=n-1;
            int remainder = 0-nums[i];
            while(j<k){
                int sum = nums[j] +nums[k];
                if(sum==remainder){
                    list1.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    while(j<k && nums[j]==nums[j+1]){
                    j++;
                    }
                    while(j<k && nums[k]==nums[k-1]){
                        k--;
                    }
                    j++;
                    k--;
                }else if(sum< remainder){
                    
                    j++;
                }else {
                    
                    k--;
                }
            }
        }
        return list1;
    }
}

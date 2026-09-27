class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> listy = new ArrayList<>();
        //-4,-1,-1,0,1,2
        int n = nums.length;
        for(int i =0;i<n-2;i++){
            int mid =i+1;
            int right =n-1;
            int diff = 0 - nums[i];
            while(mid<right){
                int sum = nums[mid] + nums[right];
                if(sum == diff){
                    listy.add(Arrays.asList(nums[i], nums[mid], nums[right]));
                    while(mid<right && nums[mid]==nums[mid+1]){
                        mid++;
                    }
                    while(mid<right && nums[right]==nums[right-1]){
                        right--;
                    }
                    while(i<n-2 && nums[i]==nums[i+1]){
                        i++;
                    }
                    mid++;
                    right--; 
                }else if(sum<diff){
                    mid++;
                }else{
                    right--;
                }
            }
        }
        return listy;
    }
}

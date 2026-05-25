class Solution {
    public int[] productExceptSelf(int[] nums) {
        //1,2,4,6

        //1,1,2,8

        int[]arr=new int[nums.length];
        int pre =1;
        int post=1;
        for(int i=0;i<nums.length;i++){
            arr[i]=pre;
            pre=pre*nums[i];
        }
        
        for(int j=nums.length-1;j>=0;j--){
           arr[j]=arr[j]*post;
           post=post*nums[j];           
        }
        return arr;
    }
}  

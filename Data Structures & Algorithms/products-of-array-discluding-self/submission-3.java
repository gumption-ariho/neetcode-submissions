class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[]arr = new int[nums.length];
        //left  //1, 1,2,8
        //--    //1 ,2,4,6
        //right//48,24,6,1

        //               ,24,12,8
        int left =1;
        arr[0]=1;
        for(int i=1;i<nums.length;i++){
            left=left*nums[i-1];
            arr[i]=left;
            
        }
        //2,4,12,8]
        //righ*left
        int right = 1;
        for(int i=nums.length-2;i>=0;i--){
            right= right*nums[i+1];
           arr[i]= right*arr[i];
           
        }
        return arr;
    }
}  

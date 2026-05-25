class Solution {
    public int[] productExceptSelf(int[] nums) {
        //orginal [1,2,4,6]
        //[1, 1,2,8]
        //[48,24,6, 1]

        //[48,24,12,8]
        int[]arr = new int[nums.length];
        arr[0]=1;
        for(int i=0;i<nums.length-1;i++){
            arr[i+1]=nums[i]*arr[i];
        }
        int[]arr2 = new int[nums.length];
        arr2[nums.length-1]=1;
        for(int i=nums.length-1;i>0;i--){
            arr2[i-1]=nums[i]*arr2[i];
        }
        int[]arr3 = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            arr3[i]=arr[i]*arr2[i];
        }
        return arr3;
        

    }
}  

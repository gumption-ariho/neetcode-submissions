class Solution {
    public int[] productExceptSelf(int[] nums) {
       //[1,1,2,8] 
       //[48,24,6,1]
       int[]arr1=new int[nums.length];
       arr1[0]=1;
    
       for(int i=0,j=1;j<nums.length;i++,j++){
        arr1[j]=nums[i]*arr1[j-1];
       }
        int arr2[]= new int[nums.length];
        arr2[nums.length-1]=1;
       for(int i=nums.length-1,j=nums.length-2;j>=0;j--,i--){
        arr2[j]=nums[i]*arr2[j+1];
       }
       int[]arr = new int[nums.length];
       for(int i=0;i<arr.length;i++){
        arr[i]=arr1[i]*arr2[i];
       }
       return arr;
    }
}  

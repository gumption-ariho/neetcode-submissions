class Solution {
    public int[] productExceptSelf(int[] nums) {
        //1,2,4,6
        //1, 1, 2,    8
        // 48  24  6  1  
        //  48   24    12   8
        int left =1;
        int arr[] = new int[nums.length];
        arr[0]=left;
        for(int i=0;i<nums.length-1;i++){
            arr[i+1]=left*nums[i];
            left=arr[i+1];
        }
        //System.out.println(Arrays.toString(arr)+"******");

        int right =1;
        for(int i=nums.length-1;i>0;i--){
            right= right*nums[i];
            arr[i-1] = right * arr[i-1];
        }
        return arr;


    }
}  

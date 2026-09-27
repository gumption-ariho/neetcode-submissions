class Solution {
    public int trap(int[] height) {
        int leftBank =0;
        int left =0;
        int rightBank=height.length-1;
        int right =height.length-1;
        int max=0;
        //0(b), 2(left), 0, 3, 1, 0, 1, 3, 2, (b)1
        while(left<right){
        if(height[left]<height[right]){
            if(height[left]<height[leftBank]){
                max=max+(height[leftBank] - height[left]);
            }else{
                leftBank=left;
            }
            left++;
            
        }else{
            if(height[right]<height[rightBank]){
                max=max+(height[rightBank] - height[right]);
            }else{
                rightBank=right;
            }
            right--;
        }
        }
        return max;
    }
}

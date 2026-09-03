class Solution {
    public int trap(int[] height) {
        int left_bank=0;
        int right_bank=0;
        int water =0;
        int left=0;
        int right = height.length-1;
        while(left<right){
            if(height[left]<height[right]){
                if(height[left]>=left_bank){
                    left_bank=height[left];
                }else{
                    water= water+left_bank-height[left];
                }
                left++;
            }else{
                if(height[right]>=right_bank){
                    right_bank=height[right];
                }else{
                    water= water+right_bank-height[right];
                }
                right--;
            }
        }
        return water;
    }
}
//rappingwater--
//stocks--
//container with most water--
//2 sum1
//2sum2
//3sum
//
class Solution {
    public int trap(int[] height) {
        int maxLeft=0;
        int maxRight=0;
        int left=0;
        int right=height.length-1;
        int water =0;
        while(left<right){
            if(height[left]<=height[right]){
            maxLeft=Math.max(height[left],maxLeft);
            if(height[left]<maxLeft){
                water =water+ maxLeft-height[left];
            }
            System.out.println(water+"********");
            left++;
            }else{
              maxRight=Math.max(height[right], maxRight);
              if(height[right]<maxRight){
                water = water+maxRight-height[right];
              }
              right--;
            }
        }
    return water;
    }
}

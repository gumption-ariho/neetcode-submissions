class Solution {
    public int trap(int[] height) {
        int right = height.length-1;
        int left = 0;
        int currLeft = 0;
        int currRight = height.length-1;
        int water =0;
        while(currLeft<=currRight){
            if(height[left]<height[right]){
                if(height[currLeft]<height[left]){
                    System.out.println("adding$$$$$$$$$$$$$$"+ (height[left]-height[currLeft])+"index"+currLeft);
                    water+=height[left]-height[currLeft];
                }
                if (height[currLeft] > height[left]) {
                    left = currLeft;
                }
                currLeft++;
                
            }else{
                if(height[currRight]<height[right]){
                    System.out.println("adding*********"+ (height[right] - height[currRight])+"index"+currRight);
                water+=height[right] - height[currRight];
                }
                if(height[currRight]>height[right]){
                    right=currRight;
                }
                currRight--;
                
            }
        }
        return water;
    }
}

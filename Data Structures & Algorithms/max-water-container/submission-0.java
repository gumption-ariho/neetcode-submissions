class Solution {
    public int maxArea(int[] heights) {
        //pivot on the tallest, move till you find one taller
        int i=0;
        int j=heights.length-1;
        int max=0;
        while(i<j){
            int product = (Math.min(heights[j],heights[i]))*(j-i);
            if(heights[i]<heights[j]){               
                i++;
            }else{
                j--;
            }
            max= Math.max(max, product);
        }
        return max;
    }
}

class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[]arr = new int[temperatures.length];
        for(int i=0;i<temperatures.length;i++){
            int j =i;
            while(j>0 && temperatures[i]>temperatures[j-1]){
                if(arr[j-1]==0){
                    arr[j-1] = i-(j-1);
                }                
                j--;
            }
        }
        //0   1  2  3   4  5
        //30,38,30,36, 35, 40, 28
        //1  ,0, 1, 2 , 1, 0
        return arr;
    }
}

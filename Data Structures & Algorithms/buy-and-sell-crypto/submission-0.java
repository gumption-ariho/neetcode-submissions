class Solution {
    public int maxProfit(int[] prices) {
       //10,  1,5,6,7,1
       //min 10,1,1 
       //max 10,1,5
       //diff 0,0,

       int min = prices[0], max =prices[0];
       int diff = max - min;
       for(int i=1;i<prices.length;i++ ){
        if(prices[i] - min > diff){
            max=prices[i];
            diff=max-min;
        }
        min=Math.min(min,prices[i]);
       }
       return diff; 
    }
}

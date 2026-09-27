class Solution {
    public int characterReplacement(String s, int k) {
        //A   A A* B A B B^
        //max1,2,3,3 4 4 4
        //maxLength1....5, 

        int maxLength=0;
        int max=0;
        HashMap<Character,Integer>map = new HashMap<>();
        for(int left=0, right=0;right<s.length();right++){
           //ideal window= k+ max 
           char x = s.charAt(right);
           map.put(x, map.getOrDefault(x,0)+1);
           max = Math.max(max, map.get(x));
           while((right-left+1) - max > k){
            char y = s.charAt(left);
            map.put(y, map.get(y) - 1);
            left++;
           }
           maxLength=Math.max(maxLength,right-left+1);
        }
        return maxLength;
    }
}

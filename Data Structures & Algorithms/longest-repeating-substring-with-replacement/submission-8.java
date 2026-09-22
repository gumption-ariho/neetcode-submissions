class Solution {
    public int characterReplacement(String s, int k) {
        //ideal window=k+max
        /*
        x
        */
        HashMap<Character,Integer>map = new HashMap<>();
        int max=0;
        int maxLength=0;
        for(int left=0, right =0;right<s.length();right++){
            
            map.put(s.charAt(right),map.getOrDefault(s.charAt(right),0)+1);
            max=Math.max(map.get(s.charAt(right)),max);//1
            
            while(right-left+1-max > k){
                map.put(s.charAt(left), map.get(s.charAt(left))-1);
                left++;
            }
            
            maxLength = Math.max(right-left+1,maxLength);//1

        }
        return maxLength;

    }
}

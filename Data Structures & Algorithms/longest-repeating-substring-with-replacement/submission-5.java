class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character,Integer> map = new HashMap<>();
        int maxlength=0;
        int max =0;
        for(int i =0,j=0;j<s.length();){
            int window = j-i +1;
            
            map.put(s.charAt(j),map.getOrDefault(s.charAt(j),0)+1);
            max = Math.max(max,map.get(s.charAt(j)));
            //ideal window ==max+k beyond drops max+k=window
            while(j<s.length()&&window>max+k){
                map.put(s.charAt(i),map.get(s.charAt(i))-1);
                i++;
                window = j-i +1;
            }
            j++;
            maxlength= Math.max(window,maxlength);

        }
        return maxlength;
    }
}

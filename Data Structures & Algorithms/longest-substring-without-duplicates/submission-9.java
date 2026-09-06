class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s==null || s.length()==1){
            return 1;
        }
        HashSet<Character> set = new HashSet<>();
        int seq= 0;
        int left =0;
        for(int i =0;i<s.length();i++){
            while(set.contains(s.charAt(i))){
                set.remove(s.charAt(left));
                left++;
                
            }
            set.add(s.charAt(i));
            seq=Math.max(seq, i-left +1);
        }
        return seq;
    }
}

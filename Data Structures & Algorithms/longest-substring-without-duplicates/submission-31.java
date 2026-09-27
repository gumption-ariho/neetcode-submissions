class Solution {
    public int lengthOfLongestSubstring(String s) {
        //pwwkew
        /*
        add p,w (max =2)
        remove p, w
        add w,k,e
        au
        */
        if(s.length()==1){
            return 1;
        }
        HashSet<Character> set = new HashSet<>();
        int max =0;//3
        for(int i=0, left =0;i<s.length();i++){
            while(set.contains(s.charAt(i))){
                set.remove(s.charAt(left++));
            }
            set.add(s.charAt(i));
            max= Math.max(set.size(),max);
        }
        return max;
    }
}

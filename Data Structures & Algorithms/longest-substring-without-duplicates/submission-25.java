class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int max =0;
        int left =0;
        for(int i=0;i<s.length();){
            while(i<s.length()&& !set.contains(s.charAt(i))){
                set.add(s.charAt(i));
                i++;
                //pw w key
            }
            max=Math.max(set.size(),max);
            if(i<s.length()&& set.contains(s.charAt(i))){
                set.remove(s.charAt(left));
                left++;
            }
        }
        return max;
    }
}

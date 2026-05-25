class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character>setty = new HashSet<>();
        int n=s.length();
        int right=0;
        int  left=0;
        int finMax=0;
        int max =0;
        //z x yz xyz
        while(right<n){
            Character c =s.charAt(right);
            if(setty.contains(c)){
                setty.remove(s.charAt(left));
                max--;
                left++;
            }else{
                setty.add(c);
                max=max+1;
                right++;
                finMax=Math.max(finMax,max);
            }
        }
        return finMax;
    }
}

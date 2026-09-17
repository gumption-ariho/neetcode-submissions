class Solution {
    public boolean isPalindrome(String s) {
        for(int i =0, j=s.length()-1;i<j;){
            while(!Character.isLetterOrDigit(s.charAt(i))&&i<j){
                i++;
            }
            while(!Character.isLetterOrDigit(s.charAt(j))&&i<j){
                j--;
            }
            if(Character.toLowerCase(s.charAt(j))!=Character.toLowerCase(s.charAt(i))){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}

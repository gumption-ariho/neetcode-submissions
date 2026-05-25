class Solution {
    public boolean isPalindrome(String s) {
        String stripped = s.replaceAll("[^0-9a-zA-Z]","").toLowerCase();
        for(int i=0, j=stripped.length()-1;i<j;i++,j--){
            if(stripped.charAt(j)!=(stripped.charAt(i))){
                return false;
            }
        }
        return true;
    }
}

class Solution {
    public boolean isPalindrome(String s) {
        String stripped = s.replaceAll("[^0-9a-zA-Z]","");
        for(int i=0, j=stripped.length()-1;i<j;i++,j--){
            if(Character.toLowerCase(stripped.charAt(j))!=Character.toLowerCase((stripped.charAt(i)))){
                return false;
            }
        }
        return true;
    }
}

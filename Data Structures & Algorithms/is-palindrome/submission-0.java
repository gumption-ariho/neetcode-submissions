class Solution {
    public boolean isPalindrome(String s) {
        String lowerCase= s.toLowerCase();
        String noSpace = lowerCase.replaceAll("[\\p{Punct}\\s]","");
        System.out.println(noSpace);
        for(int i=0,j=noSpace.length()-1;i<j;i++,j--){
            if(noSpace.charAt(i)!=noSpace.charAt(j)){
                return false;
            }
        }
        return true;
    }
}

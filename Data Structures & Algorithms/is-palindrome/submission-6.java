class Solution {
    public boolean isPalindrome(String s) {
        String sanitized = s.replaceAll("[^a-zA-Z0-9]","");
        String reversed = new StringBuilder(sanitized).reverse().toString();
        return sanitized.equalsIgnoreCase(reversed);
    }
}

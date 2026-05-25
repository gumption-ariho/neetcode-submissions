class Solution {

        // Encodes a list of strings to a single string.
    public String encode(List<String> strs) {
        if(strs==null||strs.isEmpty()){
            return Character.toString(257);
        }
        StringBuilder ans = new StringBuilder();
        for (String s : strs) {
            ans.append(s).append(Character.toString(258));
        }
        ans.deleteCharAt(ans.length()-1);
        
        return ans.toString();

    }

    // Decodes a single string to a list of strings.
    public List<String> decode(String s) {
        if(s.equals(Character.toString(257))){
            return new ArrayList<>();
        }
        List<String> ans = new ArrayList<>();
        String []arr = s.split(Character.toString(258),-1);
        for(String i: arr){
            ans.add(i);
        }
        return ans;
    }
}

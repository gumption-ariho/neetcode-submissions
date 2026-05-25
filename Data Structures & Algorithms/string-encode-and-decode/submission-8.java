class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        if(strs==null||strs.isEmpty()){
           return String.valueOf((char)259);
        }
        for(int i=0;i<strs.size();i++){
            sb.append(strs.get(i));
            if(i!=strs.size()-1){
                sb.append(String.valueOf((char)258));
            }
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        if(str.length()==1){
            if(str.charAt(0)==(char)259){
                return new ArrayList<>();
            }
        }
        String[]arr = str.split(String.valueOf((char)258),-1);
        return Arrays.asList(arr);
    }
}

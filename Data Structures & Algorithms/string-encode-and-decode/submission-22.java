class Solution {

    public String encode(List<String> strs) {
        if(strs.isEmpty()){
            return String.valueOf((char)258);
        }
        StringBuilder sb = new StringBuilder();
        for(String i:strs){
            sb.append(i);
            sb.append(String.valueOf((char)257));
        }
        sb.deleteCharAt(sb.length() - 1); 
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> list = new ArrayList<>();
        if(str.equals(String.valueOf((char)258))){
            return list;
        }
        String[]arr = str.split(String.valueOf((char)257),-1);
        for(String i: arr){
            list.add(i);
        }
        return list;
    }
}

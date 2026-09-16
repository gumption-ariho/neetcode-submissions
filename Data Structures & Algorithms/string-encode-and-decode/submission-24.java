class Solution {

    public String encode(List<String> strs) {
        if(strs==null ||strs.isEmpty()){
            char hash = 258;
            return String.valueOf(hash);
        }
        StringBuilder sb = new StringBuilder();
        char joiner = 257;
        for(String i: strs){
            sb.append(i);
            sb.append(String.valueOf(joiner));
        }
        sb.deleteCharAt(sb.length()-1);
        return sb.toString();
    }

    public List<String> decode(String str) {
        char hash = 258;
        if(str.equals(String.valueOf(hash))){
            return new ArrayList<>();
        }
        char x = 257;
        String[]arr = str.split(String.valueOf(x),-1);
        return List.of(arr);
    }
}

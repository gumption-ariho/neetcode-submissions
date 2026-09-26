class Solution {

    public String encode(List<String> strs) {
        if(strs==null ||strs.isEmpty()){
            char x = 257;
            return String.valueOf(x);
        }
        StringBuilder sb = new StringBuilder();
        char mid = 258;
        for(String i: strs){
            sb.append(i);
            sb.append(String.valueOf(mid));
        }
        sb.deleteCharAt(sb.length()-1);
        return sb.toString();
    }

    public List<String> decode(String str) {
        char x = 257;
        if(String.valueOf(x).equals(str)) return new ArrayList<>();
        char mid = 258;
        String[] arr = str.split(String.valueOf(mid),-1);
        return Arrays.asList(arr);

    }
}

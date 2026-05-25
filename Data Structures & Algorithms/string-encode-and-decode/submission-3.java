class Solution {

    public String encode(List<String> strs) {
        if(strs.isEmpty()){
            return "";
        }
      StringBuilder sb = new StringBuilder();
      for(String s: strs){
        sb.append(s.length()).append("#").append(s);
      }
      return sb.toString();
    }

    public List<String> decode(String str) {
     List<String>list = new ArrayList<>();
        if(str.isEmpty()){
            return list;
        }
        System.out.println(str);
        //3# ber4# ceer10#q
      for(int i=0;i<str.length();){
        int j=i;
        while(str.charAt(j)!='#'){
            j++;
        }
        int length = Integer.parseInt(str.substring(i,j));
        System.out.println(i);
        list.add(str.substring(j+1,j+1+length));
        
        i=1+length+j;
        System.out.println(i);
      }
      return list;
    }
}

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>>map= new HashMap<>();
        for(int i=0;i<strs.length;i++){
            char[]arr = strs[i].toCharArray();
            Arrays.sort(arr);
            String x=String.valueOf(arr);
            if(map.containsKey(x)){
              List<String>list = map.get(x);
              list.add(strs[i]);
              map.put(x,list);
            }else{
                List<String>listy= new LinkedList<>();
                listy.add(strs[i]);
                map.put(x,listy);
            }
        }
        List<List<String>>listOfLists=new LinkedList<>();
        for(List<String>listex:map.values()){
            listOfLists.add(listex);
        }
        return listOfLists;
    }
}

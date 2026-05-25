class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>>map = new HashMap<>();
        for(int i=0;i<strs.length;i++){
            int[]arr= new int[26];
            for(char j : strs[i].toCharArray()){
            arr[j-'a']++;
            }
            String x = Arrays.toString(arr);
            System.out.println(x);
            if(map.containsKey(x)){
                map.get(x).add(strs[i]);
            }else{
                List<String>listy = new ArrayList<>();
                listy.add(strs[i]);
                map.put(x,listy);
            }
        }
        List<List<String>> list = new ArrayList<>();
        for(Map.Entry<String,List<String>> m : map.entrySet()){
            list.add(m.getValue());
        }
        return list;
    }
}

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>>  map = new HashMap<>();
        for(int i=0;i<strs.length;i++){
            char[]arr = strs[i].toCharArray();
            int[] intArr = new int[26];
            for(char j: arr){
                intArr[j-'a']++;
            }
            if(map.containsKey(Arrays.toString(intArr))){
                map.get(Arrays.toString(intArr)).add(strs[i]);
            } else{
                map.put(Arrays.toString(intArr), new ArrayList<>(Arrays.asList(strs[i])));
            }
        }

        List<List<String>> listy = new ArrayList<>();

        for(List<String> i: map.values()){
            listy.add(i);
        }
        return listy;
    }
}

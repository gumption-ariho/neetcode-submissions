class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> listy = new ArrayList<>();
        //O(m*n) so we cant sort
        //use array indexed with character value
        HashMap<String, List<String>> map = new HashMap<>();
        for(String i : strs){
            int[]arr = new int[26];
            for(char x: i.toCharArray()){
                arr[x-'a']++;
            }
            if(map.containsKey(Arrays.toString(arr))){
                map.get(Arrays.toString(arr)).add(i);
            }else{
                List<String> list = new ArrayList<>();
                list.add(i);
                map.put(Arrays.toString(arr),list);
            }
        }

        for(List<String> list: map.values()){
            listy.add(list);
        }
        return listy;
    }
}

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        List<List<String>> listy = new ArrayList<>();
        HashMap<String,List<String>>mappy = new HashMap<>();
        for(String i:strs){
            StringBuilder sb = new StringBuilder();
            int[]arr = new int[26];
            for(char c : i.toCharArray()){
                arr[c - 'a']++;
            }
            if(mappy.containsKey(Arrays.toString(arr))){
                mappy.get(Arrays.toString(arr)).add(i);
            }else{
                List<String> list1 = new ArrayList<>();
                list1.add(i);
                mappy.put(Arrays.toString(arr),list1);
            }
        }
        for(List i : mappy.values()){
            listy.add(i);
        }
        return listy;
    }
}

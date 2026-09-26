class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        //HashMap key(number), value id freq
        //Create a list and sort it based on freq
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i: nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        List<Map.Entry<Integer,Integer>> list = new ArrayList<>();
        for(Map.Entry<Integer,Integer> me: map.entrySet()){
            list.add(me);
        }
        //sort in descending
        list.sort((a,b) -> b.getValue() - a.getValue());
        int[]arr = new int[k];
        int counter =0;
        for(Map.Entry<Integer,Integer> me : list){
            arr[counter++]= me.getKey();
            if(counter==k){
                break;
            }
        }
        return arr;
    }
}

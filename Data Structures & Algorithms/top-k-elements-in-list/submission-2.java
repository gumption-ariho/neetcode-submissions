class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> hashy = new HashMap<>();
//HashMap
//1->1
//2->2
//3->2
        for(int i:nums){
            hashy.put(i,hashy.getOrDefault(i,0)+1);
        }
        List<Map.Entry<Integer,Integer>> listy = new LinkedList<>(
            hashy.entrySet()
        );
        listy.sort((a,b)->b.getValue()-a.getValue());
       
        int[]arr= new int[k];
        for(int i=0;i<k;i++){
            arr[i]=listy.get(i).getKey();
        }
        return arr;
    }
}

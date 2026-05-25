class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer>map=new HashMap<>();
        HashMap<Integer,Integer>newerMap=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
       
       for(Map.Entry<Integer,Integer>mappy:map.entrySet()){
        newerMap.put(mappy.getValue(),mappy.getKey());
       }
       PriorityQueue<Map.Entry<Integer,Integer>>pq=new PriorityQueue<>(
        (a,b)->b.getValue()-a.getValue()
       );
       pq.addAll(map.entrySet());
     
       int[]array=new int[k];
       for(int i=0;i<k;i++){
        array[i]=pq.poll().getKey();
       }
      
       return array;
    }
}

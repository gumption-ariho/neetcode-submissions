class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        //Hashmap number-freq
        //1-1, 2-2, 3-3
        //map.entry iterate and get the highest.
        //Priority Queue //ascending so the smallest exit and remain with n

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        PriorityQueue<Map.Entry<Integer,Integer>> pq = new PriorityQueue<>(
            (a,b) -> a.getValue() - b.getValue()
        );

        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            
            pq.add(entry); 
            if(pq.size()>k){
                pq.poll();
            }
        }
        int[]arr = new int[k];
       for(int i=0;i<k;i++){
        arr[i] = pq.poll().getKey();
       }
       return arr; 
        
    }
}

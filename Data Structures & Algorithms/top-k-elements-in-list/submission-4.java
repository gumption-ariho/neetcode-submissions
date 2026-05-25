class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer,Integer> map = new HashMap<>();
        //1-1, 2-2,3-3
        //1,2,2,3,3,
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
       /* List<Integer>[]arr = new ArrayList[nums.length+1];

        for(int i: map.keySet()){
            int freq = map.get(i);
            if(arr[freq]==null){
                arr[freq]= new ArrayList<>();
            }
            arr[freq].add(i);
        }
        int counter=0;
        int[]arr2 = new int[k];
        for(int i=arr.length-1;counter<k;i--){
            if(arr[i]!=null){
            for(int x: arr[i]){
                arr2 [counter++] = x;
                if(counter==k){break;}
            }
            
            }
        }
        return arr2;*/

        PriorityQueue<Map.Entry<Integer,Integer>> q = new PriorityQueue<>(
            (a,b) -> b.getValue()-a.getValue()
        );
        for(Map.Entry<Integer,Integer> me: map.entrySet()){
            q.offer(me);
        }
        int []arr2 = new int[k];
        for(int i=0;i<k;i++){
            arr2[i]=q.poll().getKey();
        }
        return arr2;
        
    }
}

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        //1-1, 2,2 3-3
        for(int i: nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        //key number: value frequency
        //array index(freq) ->List(keys with that frequency)

        //[6]
        //[0,1-[1],2-[2],3[3],4,5,6]
        List<Integer>[]arr = new ArrayList[nums.length+1];

        for(Map.Entry<Integer,Integer> me: map.entrySet()){
            if(arr[me.getValue()]==null){
                List<Integer> list1 = new ArrayList<>();
                list1.add(me.getKey());
                arr[me.getValue()]= list1;
            }else{
                arr[me.getValue()].add(me.getKey());
            }
        }
        int[] arr2 = new int[k];
        int j=0;
        for(int i=nums.length;j<k;i--){
            if(arr[i]!=null){
                for(int l=0;l<arr[i].size();l++){
                    arr2[j++]=arr[i].get(l);
                }
            }
        }
        return arr2;

    }
}

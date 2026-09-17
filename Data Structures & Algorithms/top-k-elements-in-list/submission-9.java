class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        //Buckets
        //HashMap key is Number: Value is Freq
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        //n=3 (2,2,2)biggest freq 3
        //index 0->,1->,2_>, 3(3) 
        List<Integer>[]arr1 = new ArrayList[nums.length+1];
        
        for(Map.Entry<Integer,Integer> me : map.entrySet()){
            if(arr1[me.getValue()]==null){
                arr1[me.getValue()]= new ArrayList<>(Arrays.asList(me.getKey()));
            }else{
                arr1[me.getValue()].add(me.getKey());
            }
        }
        int arr [] = new int[k];
        int counter=0;
        outerLoop:
        for(int i = arr1.length-1;i>0;i--){
            if(arr1[i]!=null){
            for(int j:arr1[i]){
                arr[counter++]=j;
                if(counter==k){
                    break outerLoop;
                }
            }
            }
        }
        return arr;
    }
}

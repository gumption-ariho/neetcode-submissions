class Solution {
    public int longestConsecutive(int[] nums) {
        //place them in a set
        HashSet<Integer> set = new HashSet<>();
        for(int i: nums){
            set.add(i);
        }
        int max=0;
        for(int i : set){
            if(set.contains(i-1)){
                continue;
            }else{
                int counter = 1;
                while(set.contains(i+1)){
                    counter++;
                    i++;
                }
                max= Math.max(max, counter);
            }
        }
        return max;
    }
}

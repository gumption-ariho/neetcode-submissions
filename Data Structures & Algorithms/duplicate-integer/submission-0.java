class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer>setty= new HashSet<>();
        for(int i:nums){
            if(setty.add(i)==false){
                return true;
            }
        }
        return false;
    }
}

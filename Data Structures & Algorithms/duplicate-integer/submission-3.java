class Solution {
    public boolean hasDuplicate(int[] nums) {

        Set<Integer> setty = new HashSet<>();

        for(int i:nums){
            if(!setty.add(i)){
                return true;
            }
        }
        return false;
    }
}
class Solution {
    public int longestConsecutive(int[] nums) {
      if(nums.length==0||nums==null){
        return 0;
      }
      //2,3,4,4,5,10,20
      //0,1,1,2,3,4,5,6  
      Arrays.sort(nums);
      int max=1;
      int counter=1;
      for(int i=1;i<nums.length;i++){
        System.out.println("Inside");
        if(nums[i]-nums[i-1]==1){
            counter++;
        }else if(nums[i]==nums[i-1]){
           
            System.out.println("continued");
             continue;
        }else{
            max=max>counter?max:counter;
            System.out.println(max);
            counter=1;
        }
      }
      return max>counter?max:counter;
    }
}

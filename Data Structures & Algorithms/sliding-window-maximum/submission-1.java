class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int arr[] = new int[nums.length-k+1];
        int counter =0;
        Deque<Integer>deque = new ArrayDeque<>();//indices
        for(int left =0, right =0;right<nums.length;right++){
            
            while(!deque.isEmpty() && nums[right]>nums[deque.peekLast()]){
                deque.pollLast();
            }
            deque.offerLast(right);
            if(deque.peekFirst()<left){
                deque.pollFirst();
            }

            if(right-left+1 == k){
                arr[counter++]=nums[deque.peekFirst()];
                left++;
            }
        }
        return arr;
    }
}

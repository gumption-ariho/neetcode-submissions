class Solution {
    public int search(int[] nums, int target) {
        // ascending
        /*
               0 1 2 3 4 5
        nums=[-1,0,2,4,6,8]
        target=4
        */
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = left + ((right - left) / 2);   //2
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }
}

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        /*for(int i=0,j=numbers.length-1;i<j;){
            int sum = numbers[i]+numbers[j];
            if(i!=0&&j!=numbers.length-1){
                while(numbers[i]==numbers[i-1]){
                    i++;
                }
                while(numbers[j]==numbers[j+1]){
                    j++;
                }
            }
            if(sum==target){
                return new int[]{i+1, j+1};
            }else if(sum<target){
                i++;
            }else{
                j--;
            }
        }
        return null;*/

        //left and right pointer
        int left = 0;
        int right =numbers.length-1;

        while(left<right){
            if(numbers[left]+ numbers[right] ==target) {
                return new int[]{left+1,right+1};
            }
            if(numbers[left]+numbers[right]<target){
                left++;
            }
            if(numbers[left]+numbers[right]>target){
                right--;
            }
        }
        return new int[]{};
    }
}

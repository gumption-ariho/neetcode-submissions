class Solution {
    public int characterReplacement(String s, int k) {
        //Sliding window
        //tracking max freq and MaxLength
        //AABABBA
        //array[26]==>[4,3,,,,,]
        /*
        First====[,,,,,,1,0,0] max 1 (1-1!>2) //1
        Second====[,,,,,,1,1,0] max 1 (2-1!>2) //2
        Third====[,,,,,,1,2,0] max 2 (3-2!>2)// max length3
        Fourth====[,,,,,,2,2,0] max=2 (4-2!>2)  left=1 maxLength3
        */
        int maxLength=0;
        int maxFrequency = 0;
        int[]arr=new int[26];
        int left=0;
        for(int i =0;i<s.length();i++){
            arr[s.charAt(i)-'A']= arr[s.charAt(i)-'A'] +1;
            maxFrequency = Math.max(arr[s.charAt(i)-'A'], maxFrequency);
            //ideal ==> maxFreq+k =length
            while((i-left)+1 - maxFrequency > k){

                arr[s.charAt(left)-'A'] -= 1;
                                left++;
            }
            maxLength= Math.max((i-left)+1,maxLength);
        }
        return maxLength;
    }
}

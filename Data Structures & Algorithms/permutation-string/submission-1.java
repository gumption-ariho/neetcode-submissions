class Solution {
    public boolean checkInclusion(String s1, String s2) {
        /*
         lecabee
         ab
         l ec
        */
        if(s1.length()>s2.length()){
            return false;
        }
        int[]arr= new int[26];
        for(char i: s1.toCharArray()){
            arr[i-'a']++;
        }
        int[] arr2= new int[26];
        for(int left =0, right =0;right <s2.length();right++){
            
            while(right-left+1 > s1.length()){
                arr2[s2.charAt(left)-'a']--;
                left++;
            }
            arr2[s2.charAt(right)-'a']++;
            //System.out.println(Arrays.toString(arr)+" and "+Arrays.toString(arr2));
            if(Arrays.equals(arr,arr2)){
                return true;
            }
        }
        return false;
    }
}

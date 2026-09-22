class Solution {
    public boolean checkInclusion(String s1, String s2) {

        if (s1.length() > s2.length()) {
            return false;
        }
        int[]arr1=new int[26];
        int[]arr2=new int[26];
      for(int i=0;i<s1.length();i++){
        arr1[s1.charAt(i)-'a']++;
        arr2[s2.charAt(i)-'a']++;
      }
      if(Arrays.equals(arr1,arr2)){
        return true;
      }
      //2   //4
      for(int j=s1.length(),left =0;j<s2.length();left++,j++){
        arr2[s2.charAt(left)-'a']--;
        arr2[s2.charAt(j)-'a']++;
        if(Arrays.equals(arr1,arr2)){
        return true;
        }
      }
      return false;
    }
}

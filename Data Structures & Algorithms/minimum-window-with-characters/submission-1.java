class Solution {
    public String minWindow(String s, String t) {
        if(t.length()>s.length()){
            return "";
        }
        int []arr = new int[]{-1,0,0};//length,left,right
        HashMap<Character,Integer> needed = new HashMap<>();
        for(char i: t.toCharArray()){
            needed.put(i,needed.getOrDefault(i,0)+1);
        }
        int neededCount = needed.size();
        HashMap<Character,Integer> have = new HashMap<>();
        int haveCount=0;
        int minLength = Integer.MAX_VALUE;

        for(int left =0, right =0;right<s.length();right++){
            char current = s.charAt(right);
            have.put(current, have.getOrDefault(current,0)+1);
            if(needed.containsKey(current)&&needed.get(current).equals(have.get(current))){
                haveCount++;
            }
            //OUZODYX
            while(haveCount==neededCount){
                int currLength = right-left+1;
                if(currLength<minLength){
                minLength=  currLength;  
                arr[0]=currLength;//6
                arr[1]=left;//0
                arr[2]=right;//6
                }
                char leftChar = s.charAt(left);
                have.put(leftChar, have.get(leftChar)-1);

                if(needed.containsKey(leftChar) && have.get(leftChar)<needed.get(leftChar)){
                    haveCount--;
                }
                left++;
            }
        }

        return arr[0]==-1?"":s.substring(arr[1], arr[2] + 1);

    }
}

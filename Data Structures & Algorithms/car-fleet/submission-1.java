class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        //position
        //speed
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<position.length;i++){
            map.put(position[i],speed[i]);
        }
        List<Map.Entry<Integer,Integer>> list = new ArrayList<>();
        for(Map.Entry<Integer,Integer> me : map.entrySet()){
            list.add(me);
        }
        list.sort((a,b)-> b.getKey()-a.getKey()); //sorting them by distance descending

        //(7,1) (4,2) (1,2) (0,1)

        //(8,2) (6,3) 10
        //1    1

        Stack<Double> stack = new Stack<>(); //times
        for(Map.Entry<Integer,Integer> me: list){
            double time = (double)(target - me.getKey())/me.getValue();
            if(stack.isEmpty() || stack.peek()<time){
                stack.push(time);
            }
        }
        return stack.size();
    }
}

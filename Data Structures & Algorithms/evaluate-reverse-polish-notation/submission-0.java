class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for(String i: tokens){
            
            if(i.equals("*") || i.equals("+") || i.equals("-") || i.equals("/") ){
                int x = (Integer)stack.pop();
                int y = (Integer)stack.pop();
                switch(i){
                    case "*": stack.push(y *x);
                    break;
                    case "+": stack.push(y + x);
                    break;
                    case "-": stack.push(y - x);
                    break;
                    case "/": stack.push(y / x);
                    break;

                }
            }else{
            stack.push(Integer.valueOf(i));
            }
        }
        return stack.peek();
    }
}

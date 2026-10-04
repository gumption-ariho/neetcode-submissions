class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer>stack = new Stack<>();
    for(String i: tokens){
        if(i.equals("*") || i.equals("+") || i.equals("/") || i.equals("-")){
            int right = stack.pop();
            int left = stack.pop();
            switch(i){
                case "*":
                stack.push(left*right);
                break;
                case "+":
                stack.push(left+right);
                break;
                case "/":
                stack.push(left/right);
                break;
                case "-":
                stack.push(left-right);
                break;
            }
        }else{
            stack.push(Integer.valueOf(i));
        }
    }
    return stack.peek();
    }
}

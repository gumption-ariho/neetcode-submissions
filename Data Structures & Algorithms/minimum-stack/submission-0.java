class MinStack {
    Stack<Integer> minStack;
    Stack<Integer> stack;
    public MinStack() {
        minStack = new Stack<>();
        stack = new Stack<>();
    }
    //1,2,0,
    //1 x 0
    public void push(int val) {
        stack.push(val);
        if(!minStack.isEmpty() && val < minStack.peek()){
            minStack.push(val);
        }else if(minStack.isEmpty()){
            minStack.push(val);
        }else if(val >= minStack.peek()){
            minStack.push(minStack.peek());
        }
        
    }
    
    public void pop() {
        stack.pop();
        minStack.pop();

    }
    
    public int top() {
       return stack.peek();
    }
    
    public int getMin() {
        return minStack.peek();
    }
}

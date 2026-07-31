class MinStack {
    Stack<Integer> minStack;
    Stack<Integer> stack;
    int currMin = Integer.MAX_VALUE;
    public MinStack() {
        minStack = new Stack<>();
        stack = new Stack<>();
    }
    
    public void push(int val) {
        stack.push(val);
        if(minStack.isEmpty()){
            minStack.push(val);
        }else{
            currMin = Math.min(val,minStack.peek());
            minStack.push(currMin);
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

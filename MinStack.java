class MinStack {

    /** initialize your data structure here. */
    private Stack<Integer> s=new Stack<>();
    private Stack<Integer> minStack=new Stack<>();
    
    public MinStack() {
        
    }
    
    public void push(int x) {
        
        s.push(x);
        
        if(minStack.isEmpty() || x <= minStack.peek()){
            minStack.push(x);
        }
    
    }
    
    public void pop() {
        
        int current=s.pop();
        
        if(minStack.peek() == current)
            minStack.pop();
        
    }
    
    public int top() {
        
        return s.peek();
        
    }
    
    public int getMin() {
        
        return minStack.peek();
        
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */

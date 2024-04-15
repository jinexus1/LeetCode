//Intution behind this question is maintain two stacks at the same time
//Stack 1 also know as first stack is just to take the input
//Stack 2 also known as second stack used to hold the reverse of stack
//these two stacks are required to make queue
class MyQueue {
    Stack<Integer> first;
    Stack<Integer> second;
    public MyQueue() {
       first=new Stack<>();
       second=new Stack<>();

    }
    
    public void push(int x) {
        first.push(x);
    }
    
    public int pop() {
        while(!first.isEmpty()){
            second.push(first.pop());
        }
        int removed=second.pop();
        while(!second.isEmpty()){
            first.push(second.pop());
        }
        return removed;
        
    }
    
    public int peek() {
        while(!first.isEmpty()){
            second.push(first.pop());
        }
        int peek=second.peek();//just see the top of stack
        while(!second.isEmpty()){
            first.push(second.pop());
        }
        return peek;
    }
    
    public boolean empty() {
        return first.isEmpty();   
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */

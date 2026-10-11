class MyQueue {

    Stack<Integer> st = new Stack<>();
    Stack<Integer> st2 = new Stack<>();

    public MyQueue() {

    }

    public void push(int x) {
        st.push(x);
    }

    public int pop() {
        if(st2.isEmpty()){
            while(!st.isEmpty()){
                st2.push(st.pop());
            }
        }
        return st2.pop();
    }

    public int peek() {
        if(st2.isEmpty()){
            while(!st.isEmpty()){
                st2.push(st.pop());
            }
        }
        return st2.peek();
    }

    public boolean empty() {
        return st.isEmpty() && st2.isEmpty();
    }
}
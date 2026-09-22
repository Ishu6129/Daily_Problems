// Last updated: 9/22/2026, 9:09:37 AM
1class MyQueue {
2    Stack<Integer> st1;
3    Stack<Integer> st2;
4    int peek;
5    public MyQueue() {
6        this.st1=new Stack<>();
7        this.st2=new Stack<>();
8    }
9    
10    public void push(int x) {
11        st1.add(x);
12    }
13    
14    public int pop() {
15        while(!st1.isEmpty()){
16            st2.add(st1.pop());
17        }
18        int ans=st2.pop();
19        while(!st2.isEmpty()){
20            st1.add(st2.pop());
21        }
22        return ans;
23    }
24    
25    public int peek() {
26        while(!st1.isEmpty()){
27            st2.add(st1.pop());
28        }
29        int ans=st2.peek();
30        while(!st2.isEmpty()){
31            st1.add(st2.pop());
32        }
33        return ans;
34    }
35    
36    public boolean empty() {
37        return st1.isEmpty();
38    }
39}
40
41/**
42 * Your MyQueue object will be instantiated and called as such:
43 * MyQueue obj = new MyQueue();
44 * obj.push(x);
45 * int param_2 = obj.pop();
46 * int param_3 = obj.peek();
47 * boolean param_4 = obj.empty();
48 */
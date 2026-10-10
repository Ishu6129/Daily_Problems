// Last updated: 10/10/2026, 3:51:47 PM
1class MyStack {
2    Queue<Integer> q1;
3    Queue<Integer> q2;
4    public MyStack() {
5        q1 = new LinkedList<>();
6        q2 = new LinkedList<>();
7    }
8    
9    public void push(int x) {
10        q2.add(x);
11        while (!q1.isEmpty()) {
12            q2.add(q1.poll());
13        }
14        Queue<Integer> temp = q1;
15        q1=q2;
16        q2=temp;
17    }
18    
19    public int pop() {
20        return q1.poll();
21    }
22    
23    public int top() {
24        return q1.peek();
25    }
26    
27    public boolean empty() {
28        return q1.isEmpty();
29    }
30}
31
32/**
33 * Your MyStack object will be instantiated and called as such:
34 * MyStack obj = new MyStack();
35 * obj.push(x);
36 * int param_2 = obj.pop();
37 * int param_3 = obj.top();
38 * boolean param_4 = obj.empty();
39 */
// Last updated: 06/12/2025, 18:01:14
1class MinStack {
2    private int min;
3    private Stack<Integer> s;
4    public MinStack() {
5        s=new Stack<>();
6        min=Integer.MAX_VALUE;
7    }
8    
9    public void push(int val) {
10        if (val <= min) {
11            s.push(min);
12            min = val;
13        }
14        s.push(val);
15    }
16    
17    public void pop() {
18        if (s.pop() == min) {
19            min = s.pop();
20        }
21    }
22    
23    public int top() {
24        return s.peek();
25    }
26    
27    public int getMin(){
28        return min;
29    }
30}
31
32/**
33 * Your MinStack object will be instantiated and called as such:
34 * MinStack obj = new MinStack();
35 * obj.push(val);
36 * obj.pop();
37 * int param_3 = obj.top();
38 * int param_4 = obj.getMin();
39 */
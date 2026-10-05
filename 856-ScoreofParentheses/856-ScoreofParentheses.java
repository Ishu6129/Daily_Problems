// Last updated: 10/5/2026, 4:26:33 PM
1class Solution {
2    public int scoreOfParentheses(String s) {
3        Stack<Integer> st=new Stack<>();
4        st.push(0);
5        for(char ch:s.toCharArray()){
6            if(ch=='('){
7                st.push(0);
8            }
9            else{
10                int val=st.pop();
11                int scr=(val==0)?1:(2*val);
12                st.push(scr+st.pop());
13            }
14        }
15        return st.pop();
16    }
17}
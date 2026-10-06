// Last updated: 10/6/2026, 12:16:12 PM
1class Solution {
2    public int minAddToMakeValid(String s) {
3        Stack<Character> st=new Stack<>();
4        int c=0;
5        for(char ch:s.toCharArray()){
6            if(ch==')' && !st.isEmpty() && st.peek()=='('){
7                st.pop();
8                c--;
9            }
10            else {
11                st.push(ch);
12                c++;
13            }
14        }
15        return c;
16    }
17}
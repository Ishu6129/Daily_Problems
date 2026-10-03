// Last updated: 10/3/2026, 12:29:50 PM
1class Solution {
2    public int longestValidParentheses(String s) {
3        int c=0;
4        int ans=0;
5        int n=s.length();
6        Stack<Integer> st=new Stack<>();
7        st.push(-1);
8        for(int i=0;i<n;i++){
9            char ch=s.charAt(i);
10            if(ch==')'){
11                st.pop();
12                if(st.isEmpty()){
13                    st.push(i);
14                }
15                else{
16                    ans=Math.max(ans,i-st.peek());
17                }
18            }
19            else{
20                st.push(i);
21            }
22        }
23        return ans;
24    }
25}
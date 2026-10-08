// Last updated: 10/8/2026, 1:41:48 PM
1class Solution {
2    public String removeOuterParentheses(String s) {
3        int n=s.length();
4        StringBuilder sb=new StringBuilder();
5        for(int i=0;i<n;i++){
6            char ch=s.charAt(i);
7            if(ch=='('){
8                Stack<Character> st=new Stack<>();
9                st.add('(');
10                i++;
11                while(!st.isEmpty() && i<n){
12                    char ch2=s.charAt(i);
13                    if(ch2==')') st.pop();
14                    else st.add('(');
15                    if(!st.isEmpty()){ 
16                        sb.append(ch2);
17                        i++;
18                    }
19                }
20            }
21        }
22        return sb.toString();
23    }
24}
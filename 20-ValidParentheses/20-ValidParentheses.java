// Last updated: 10/1/2026, 12:10:07 PM
1class Solution {
2    public boolean isValid(String s) {
3        if(s.length()<2){
4            return false;
5        }
6        Stack<Character> st=new Stack<>();
7        for(int i=0;i<s.length();i++){
8            char ch=s.charAt(i);
9            if(ch=='(' || ch=='[' || ch=='{' ){
10                st.push(ch);
11             }
12            else{
13                if(!st.isEmpty()){
14                    char pk=st.peek();
15                    if(ch==')' && pk=='(' || ch==']' && pk=='[' || ch=='}' && pk=='{'){
16                        st.pop();
17                    }
18                    else return false;
19                }
20                else return false;
21            }
22        } 
23        return st.isEmpty();  
24    }
25}
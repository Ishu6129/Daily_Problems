// Last updated: 10/8/2026, 1:43:51 PM
1class Solution {
2    public String removeOuterParentheses(String s) {
3        int n=s.length();
4        int c=0;
5        StringBuilder sb=new StringBuilder();
6        for(int i=0;i<n;i++){
7            char ch=s.charAt(i);
8            if(ch=='('){
9                if(c>0) sb.append('(');
10                c++;
11            }
12            else{
13                c--;
14                if(c>0) sb.append(')');
15            }
16            
17        }
18        return sb.toString();
19    }
20}
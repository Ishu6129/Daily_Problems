// Last updated: 10/9/2026, 11:49:56 AM
1class Solution {
2    public int minInsertions(String s) {
3        Stack<Character> st=new Stack<>();
4        int op=0;
5        int cl=0;
6        int ans=0;
7        int n=s.length();
8        for(int i=0;i<n;i++){
9            char ch=s.charAt(i);
10            if(ch=='(') st.add('(');
11            else{
12                if((i+1)<n && s.charAt(i+1)==')'){
13                    i++;
14                }
15                else{
16                    ans++;
17                }
18                if(st.isEmpty()) ans++;
19                else st.pop();
20            }
21        }
22        ans+=(2*st.size());
23        return ans;
24    }
25}
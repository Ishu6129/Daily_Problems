// Last updated: 10/9/2026, 11:50:06 AM
1class Solution {
2    public int minInsertions(String s) {
3        Stack<Character> st=new Stack<>();
4        int ans=0;
5        int n=s.length();
6        for(int i=0;i<n;i++){
7            char ch=s.charAt(i);
8            if(ch=='(') st.add('(');
9            else{
10                if((i+1)<n && s.charAt(i+1)==')'){
11                    i++;
12                }
13                else{
14                    ans++;
15                }
16                if(st.isEmpty()) ans++;
17                else st.pop();
18            }
19        }
20        ans+=(2*st.size());
21        return ans;
22    }
23}
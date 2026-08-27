// Last updated: 8/27/2026, 8:03:15 PM
1class Solution {
2    public String simplifyPath(String path) {
3        String[] arr=path.split("/");
4        Stack<String> st=new Stack<>();
5        for(String s:arr){
6            if(!s.isEmpty()){
7                if(s.equals("..")){
8                    if(!st.isEmpty()) st.pop();
9                }
10                else if(s.equals(".")) continue;
11                else st.push(s);
12            }
13        }
14        StringBuilder ans=new StringBuilder();
15        while(!st.isEmpty()){
16            String str=st.pop();
17            ans.insert(0,"/"+str);
18        }
19        if(ans.isEmpty()) return "/";
20        return ans.toString();
21    }
22}
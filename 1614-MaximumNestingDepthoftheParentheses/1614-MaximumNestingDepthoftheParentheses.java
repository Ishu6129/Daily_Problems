// Last updated: 9/28/2026, 10:46:53 AM
1class Solution {
2    public int maxDepth(String s) {
3        int mx=0;
4        int c=0;
5        for(char ch:s.toCharArray()){
6            if(ch=='(') c++;
7            else if(ch==')') c--;
8            mx=Math.max(mx,c);
9        }
10        return mx;
11    }
12}
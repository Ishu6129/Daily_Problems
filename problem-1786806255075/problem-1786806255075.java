// Last updated: 8/15/2026, 8:34:15 PM
1class Solution {
2    public int minOperations(String s) {
3        int n=s.length();
4        int ans=Integer.MAX_VALUE;
5        for(int r=0;r<n;r++){
6            int cst=r;
7            for(int i=0;i<n/2;i++){
8                char a=s.charAt((r+i)%n);
9                char b=s.charAt((r+n-1-i)%n);
10                int x=Math.abs(a-b);
11                cst+=Math.min(x,26-x);
12            }
13            ans=Math.min(ans,cst);
14        }
15        return ans;
16    }
17}
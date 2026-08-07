// Last updated: 8/7/2026, 10:45:09 PM
1class Solution {
2    int[] dp;
3    public int numTrees(int n) {
4       dp=new int[n+1];
5       Arrays.fill(dp,-1);
6       return find(n);
7    }
8    public int find(int n){
9        if(n<=1) return 1;
10        if(dp[n]!=-1) return dp[n];
11       int ans=0;
12       for(int i=1;i<=n;i++) ans+=(find(i-1)*find(n-i));
13       return dp[n]=ans;
14    }
15}
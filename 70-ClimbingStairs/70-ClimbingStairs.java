// Last updated: 05/01/2026, 11:48:55
1class Solution {
2    public int climbStairs(int n) {
3        int[] dp=new int[n+1];
4        Arrays.fill(dp,-1);
5        return find(n,dp);
6    }
7    public int find(int n,int[] dp){
8        if(n<0) return 0;
9        if(n==0) return 1;
10        if(dp[n]!=-1) return dp[n];
11        return dp[n]=find(n-1,dp)+find(n-2,dp); 
12    }
13}
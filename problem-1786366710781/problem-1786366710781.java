// Last updated: 8/10/2026, 6:28:30 PM
1class Solution {
2    Boolean dp[];
3    public boolean winnerSquareGame(int n) {
4        dp=new Boolean[n+1];
5        return solve(n);
6    }
7    public boolean solve(int n){
8        if(n==0) return false;
9        if(dp[n]!=null) return dp[n];
10        for(int i=1;i*i<=n;i++){
11            int sq=i*i;
12            if(!solve(n-sq)) return dp[n]= true;
13        }
14        return dp[n]=false;
15    } 
16}
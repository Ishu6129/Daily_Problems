// Last updated: 12/10/2025, 00:55:00
class Solution {
    public int change(int amount, int[] coins) {
        int[][] dp= new int[amount+1][coins.length];
        for(int[] arr:dp){
            Arrays.fill(arr,-1);
        }
        return f(amount,coins,0,dp);
    }
    public int f(int amt,int[] coins,int idx,int[][] dp){
        if(amt==0) return 1;
        if(idx==coins.length) return 0;
        if(dp[amt][idx]!=-1) return dp[amt][idx];
        int inc=0;
        if(coins[idx]<=amt){
            inc=f(amt-coins[idx],coins,idx,dp);
        }
        int exc=f(amt,coins,idx+1,dp);
        return dp[amt][idx]=inc+exc;
    }
}
// Last updated: 12/10/2025, 00:55:16
class Solution {
    public int coinChange(int[] coins, int amount) {
        int n=coins.length;
        int dp[][] = new int[n][amount+1];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= amount; j++) {
                dp[i][j] = -1;
            }
        }
        int ans= f(n-1,amount,coins,dp);
        if(ans>=(int)1e9) return -1;
        return ans;

    }
    public int f(int ind,int t,int[] coins,int[][] dp){
        if(ind==0){
            if(t%coins[0]==0) return t/coins[0];
            return (int)1e9;
        }
        if(dp[ind][t]!=-1) return dp[ind][t];
        int take=Integer.MAX_VALUE;
        int ntake=f(ind-1,t,coins,dp);
        if(coins[ind]<=t){
            take=1+f(ind,t-coins[ind],coins,dp);
        }
        return dp[ind][t]=Math.min(take,ntake);
    }
}
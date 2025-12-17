// Last updated: 17/12/2025, 21:19:47
1class Solution {
2    public long maximumProfit(int[] prices, int k) {
3        long[][][][] dp=new long[prices.length][k+1][2][2]; 
4        return solve(prices,0,k,0,0,dp);
5    }
6    public long solve(int[] prices,int idx,int k,int buy,int sell,long[][][][] dp){
7        if(idx==prices.length || k==0){
8            if(buy==1 || sell==1 ) return Long.MIN_VALUE/2;
9            return 0;
10        }
11        if(dp[idx][k][buy][sell]!=0) return dp[idx][k][buy][sell];
12        long ans=Long.MIN_VALUE;
13        if(buy==0 && sell==0){ // not holding any transaction
14            ans=Math.max(ans,-prices[idx]+solve(prices,idx+1,k,1,0,dp)); //buy
15            ans=Math.max(ans,prices[idx]+solve(prices,idx+1,k,0,1,dp)); //sell
16            ans=Math.max(ans,solve(prices,idx+1,k,0,0,dp)); //skip
17        }
18        if(buy==1 && sell==0){ // already buy
19            ans=Math.max(ans,prices[idx]+solve(prices,idx+1,k-1,0,0,dp)); // sell
20            ans=Math.max(ans,solve(prices,idx+1,k,1,0,dp)); // skip
21        }
22        if(buy==0 && sell==1){ // already buy
23            ans=Math.max(ans,-prices[idx]+solve(prices,idx+1,k-1,0,0,dp)); // buy
24            ans=Math.max(ans,solve(prices,idx+1,k,0,1,dp)); // skip
25        }
26        return dp[idx][k][buy][sell]=ans;
27
28    }
29}
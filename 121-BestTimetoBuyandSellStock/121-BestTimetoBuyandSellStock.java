// Last updated: 21/03/2026, 12:12:33
1class Solution {
2    public int maxProfit(int[] prices) {
3        int n=prices.length;
4        int min=Integer.MAX_VALUE;
5        int ans=0;
6        for(int i=0;i<n;i++){
7            min=Math.min(prices[i],min);
8            ans=Math.max(ans,prices[i]-min);
9        }
10        return ans;
11    }
12}
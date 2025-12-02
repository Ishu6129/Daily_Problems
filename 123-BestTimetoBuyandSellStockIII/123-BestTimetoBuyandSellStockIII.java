// Last updated: 02/12/2025, 17:57:11
1class Solution {
2    public int maxProfit(int[] prices) {
3        int profit1=0;
4        int min1=Integer.MAX_VALUE;
5        int profit2=0;
6        int min2=Integer.MAX_VALUE;
7        for(int i=0;i<prices.length;i++){
8            min1=Math.min(min1,prices[i]);
9            profit1=Math.max(profit1,prices[i]-min1);
10            min2=Math.min(min2,prices[i]-profit1);
11            profit2=Math.max(profit2,prices[i]-min2);
12        }
13        return profit2;
14    }
15}
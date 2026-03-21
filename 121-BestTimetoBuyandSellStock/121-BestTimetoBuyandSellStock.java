// Last updated: 21/03/2026, 12:06:51
1class Solution {
2    public int maxProfit(int[] prices) {
3        int n=prices.length;
4        int min=prices[0];
5        int ans=0;
6        for(int i=0;i<n;i++){
7           if(prices[i]<min){
8            min=prices[i];
9           }
10           else{
11            ans=Math.max(ans,prices[i]-min);
12           }
13        }
14        return ans;
15    }
16}
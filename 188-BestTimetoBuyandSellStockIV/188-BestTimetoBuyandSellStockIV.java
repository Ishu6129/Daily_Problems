// Last updated: 02/12/2025, 18:31:23
1class Solution {
2    public int maxProfit(int k, int[] prices) {
3        int[] min=new int[k];
4        int[] profit=new int[k];
5        for(int i=0;i<k;i++){
6            min[i]=Integer.MAX_VALUE;
7            profit[i]=0;
8        }
9        for(int i=0;i<prices.length;i++){
10            for(int j=0;j<k;j++){
11                min[j]=Math.min(min[j],prices[i]-(j>0?profit[j-1]:0));
12                profit[j]=Math.max(profit[j],prices[i]-min[j]);
13            }
14        }
15        return profit[k-1];
16    }
17}
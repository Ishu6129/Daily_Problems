// Last updated: 6/1/2026, 11:22:47 AM
1class Solution {
2    public int minimumCost(int[] cost) {
3        int n=cost.length;
4        if(n==1) return cost[0];
5        Arrays.sort(cost);
6        int ans=0;
7        for(int i=n-1;i>=0;i-=3){
8            ans+=cost[i];
9            if((i-1)>=0)  ans+=cost[i-1];
10        }
11        return ans;
12    }
13}
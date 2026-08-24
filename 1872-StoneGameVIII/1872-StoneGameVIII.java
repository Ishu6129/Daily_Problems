// Last updated: 8/24/2026, 7:17:12 PM
1class Solution {
2    public int stoneGameVIII(int[] stones) {
3        int n=stones.length;
4        int[] dp=new int[n];
5        int[] presm=new int[n+1];
6        for(int i=1;i<=n;i++){
7            presm[i]=presm[i-1]+stones[i-1];
8        }
9        dp[n-1]=presm[n];
10        for (int i=n-2;i>= 1;i--) {
11            dp[i]=Math.max(dp[i+1],presm[i+1]-dp[i + 1]);
12        }
13        return dp[1];
14    }
15
16}
// Last updated: 12/03/2026, 23:23:49
1class Solution {
2    public double champagneTower(int poured, int query_row, int query_glass) {
3        double[][] dp = new double[101][101];
4        dp[0][0] = poured;
5        for(int r=0;r<=query_row;r++){
6            for(int c=0;c<=r;c++){
7                if(dp[r][c]>1){
8                    double of=(dp[r][c]-1)/2.0;
9                    dp[r][c]=1;
10                    dp[r+1][c]+=of;
11                    dp[r+1][c+1]+=of;
12                }
13            }
14        }
15        return Math.min(1,dp[query_row][query_glass]);
16
17    }
18}
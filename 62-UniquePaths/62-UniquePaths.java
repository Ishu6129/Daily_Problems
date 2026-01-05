// Last updated: 05/01/2026, 13:02:43
1class Solution {
2    public int uniquePaths(int m, int n) {
3        int dp[][] =new int[m][n];
4        for(int[] i:dp){
5            Arrays.fill(i,-1);
6        }
7        return find(m,n,0,0,dp);
8    }
9    public int find(int m,int n,int i,int j,int[][] dp){
10        if(i==m-1 && j==n-1) return 1;
11        if(i>=m || j>=n) return 0;
12        if(dp[i][j]!=-1) return dp[i][j];
13        return dp[i][j]=find(m,n,i+1,j,dp)+find(m,n,i,j+1,dp);
14    }
15}
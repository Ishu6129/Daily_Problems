// Last updated: 05/01/2026, 13:17:52
1class Solution {
2    public int minPathSum(int[][] grid) {
3       int m=grid.length;
4        int n=grid[0].length;
5        int dp[][] =new int[m][n];
6        for(int[] i:dp){
7            Arrays.fill(i,Integer.MAX_VALUE);
8        }
9        return find(grid,m,n,0,0,dp);
10    }
11    public int find(int[][] grid,int m,int n,int i,int j,int[][] dp){
12        if(i==m-1 && j==n-1) return grid[i][j];
13        if(i>=m || j>=n) return Integer.MAX_VALUE;
14        if(dp[i][j]!=Integer.MAX_VALUE) return dp[i][j];
15        return dp[i][j]=grid[i][j]+Math.min(find(grid,m,n,i+1,j,dp),find(grid,m,n,i,j+1,dp));
16    }
17}
// Last updated: 05/01/2026, 13:10:18
1class Solution {
2    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
3        int m=obstacleGrid.length;
4        int n=obstacleGrid[0].length;
5        if(obstacleGrid[m-1][n-1]==1) return 0;
6        int dp[][] =new int[m][n];
7        for(int[] i:dp){
8            Arrays.fill(i,-1);
9        }
10        return find(obstacleGrid,m,n,0,0,dp);
11    }
12    public int find(int[][] grid,int m,int n,int i,int j,int[][] dp){
13        if(i==m-1 && j==n-1) return 1;
14        if(i>=m || j>=n || grid[i][j]==1) return 0;
15        if(dp[i][j]!=-1) return dp[i][j];
16        return dp[i][j]=find(grid,m,n,i+1,j,dp)+find(grid,m,n,i,j+1,dp);
17    }
18}
// Last updated: 18/03/2026, 19:36:44
1class Solution {
2    public int countSubmatrices(int[][] grid, int k) {
3        int n=grid.length;
4        int m=grid[0].length;
5        int ans=0;
6        for(int i=0;i<n;i++){
7            for(int j=0;j<m;j++){
8                if(i>0) grid[i][j]+=grid[i-1][j];
9                if(j>0) grid[i][j]+=grid[i][j-1];
10                if((i>0)&&(j>0)) grid[i][j]-=grid[i-1][j-1];
11                if(grid[i][j]<=k) ans++;
12            }
13        }
14        return ans;
15    }
16}
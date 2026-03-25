// Last updated: 25/03/2026, 22:27:11
1class Solution {
2    public boolean canPartitionGrid(int[][] grid) {
3        int m=grid.length;
4        int n=grid[0].length;
5        long pre[][]=new long[m][n];
6        pre[0][0]=grid[0][0];
7        Set<Double> set=new HashSet<>(); 
8        for(int i=0;i<m;i++){
9            for(int j=0;j<n;j++){
10                if(i>0) pre[i][j]+=pre[i-1][j]+grid[i][j];
11                if(j>0) pre[i][j]+=pre[i][j-1]+grid[i][j];
12                if(i>0 && j>0) pre[i][j]-=(pre[i-1][j-1]+grid[i][j]);
13                if(i==m-1 || j==n-1) set.add((double)pre[i][j]);
14            }
15        }
16        return set.contains(pre[m-1][n-1]/2.0)?true:false;
17    }
18}
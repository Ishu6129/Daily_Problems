// Last updated: 21/03/2026, 18:03:18
1class Solution {
2    public int[][] reverseSubmatrix(int[][] grid, int x, int y, int k) {
3        for(int i=0;i<k/2;i++){
4            for(int j=0;j<k;j++){
5                int temp=grid[i+x][j+y];
6                grid[i+x][j+y]=grid[x+k-1-i][j+y];
7                grid[x+k-1-i][j+y]=temp;
8            }
9        }
10        return grid;
11    }
12}
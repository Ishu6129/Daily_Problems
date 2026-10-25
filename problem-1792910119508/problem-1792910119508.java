// Last updated: 10/25/2026, 12:05:19 PM
1class Solution {
2    int[][] grid;
3    int m,n;
4    public int closedIsland(int[][] grid) {
5        this.grid=grid;
6        m=grid.length;
7        n=grid[0].length;
8        int c=0;
9        for(int i=0;i<m;i++){
10            for(int j=0;j<n;j++){
11                if(grid[i][j]==0 && check(i,j)) c++;
12            }
13        }
14        return c;
15    }
16    public boolean check(int i,int j){
17        if(i<0 || i>=m || j<0 || j>=n) return false;
18        if(grid[i][j]==1) return true;
19        grid[i][j]=1;
20        return check(i,j+1) & check(i,j-1) & check(i+1,j) & check(i-1,j);
21    }
22}
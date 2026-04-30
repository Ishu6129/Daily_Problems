// Last updated: 4/30/2026, 6:11:38 PM
1class Solution {
2    int[][] grid;
3    int n;
4    int m;
5    int k;
6    int[][][] dp;
7    public int maxPathScore(int[][] grid, int k) {
8        this.grid=grid;
9        this.n=grid.length;
10        this.m=grid[0].length;
11        this.k=k;
12        dp=new int[n+1][m+1][k+1];
13        for(int[][] i:dp){
14            for(int[] j:i){
15                Arrays.fill(j,-2);
16            }
17        }
18        int ans=find(0, 0, 0);
19        return ans==-1?-1:ans;
20    }
21    public int find(int i,int j,int c){
22        if(i>=n || j>=m ) return -1;
23        int n_c=c+(grid[i][j]==0?0:1);
24        if(n_c>k) return -1;
25        if(i==n-1 && j==m-1) return grid[i][j];
26        
27        if(dp[i][j][c]!=-2) return dp[i][j][c];
28        
29        int right=find(i,j+1,n_c);    
30        int down=find(i+1,j,n_c);
31        if (right==-1 && down ==-1) {
32            return dp[i][j][n_c]=-1;
33        }
34        return dp[i][j][c]=grid[i][j]+Math.max(right,down);
35    }
36}
// Last updated: 19/03/2026, 13:15:22
1class Solution {
2    public int numberOfSubmatrices(char[][] grid) {
3        int n=grid.length;
4        int m=grid[0].length;
5        int[][] px=new int[n][m];
6        int[][] py=new int[n][m];
7        int ans=0;
8        for(int i=0;i<n;i++){
9            for(int j=0;j<m;j++){
10                int x=grid[i][j]=='X'?1:0;
11                int y=grid[i][j]=='Y'?1:0;
12                px[i][j]=x;
13                py[i][j]=y;
14                if(i>0){
15                    px[i][j]+=px[i-1][j];
16                    py[i][j]+=py[i-1][j];
17                }
18                if(j>0){
19                    px[i][j]+=px[i][j-1];
20                    py[i][j]+=py[i][j-1];
21                }
22                if(i>0&&j>0){
23                    px[i][j]-=px[i-1][j-1];
24                    py[i][j]-=py[i-1][j-1];
25                }
26                if(px[i][j]>0 && py[i][j]>0 && px[i][j]==py[i][j])ans++;
27            }
28        }
29        return ans;
30    }
31}
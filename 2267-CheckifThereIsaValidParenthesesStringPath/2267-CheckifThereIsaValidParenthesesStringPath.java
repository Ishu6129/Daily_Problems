// Last updated: 9/29/2026, 12:16:33 PM
1class Solution {
2    char[][] arr;
3    int n;
4    int m;
5    int[][][] dp;
6    boolean flag=false;
7    public boolean hasValidPath(char[][] grid) {
8        this.arr=grid;
9        this.n=grid.length;
10        this.m=grid[0].length;
11        this.dp=new int[n][m][n+m];
12        find(0,0,new int[]{0,0});
13        if(flag) return true;
14        return false;
15    }
16    public void find(int i,int j,int[] oc){
17        if(oc[0]<oc[1] || i>=n || j>=m || flag) return;
18        char ch=arr[i][j];
19        int op=(ch=='('?1:0);
20        int cl=1-op;
21        int open=oc[0]+op;
22        int close=oc[1]+cl;
23        if(open<close) return;
24        if(i==n-1 && j==m-1){
25            if(open==close) flag=true;
26            return;
27        }
28        int bal=open-close;
29        if(dp[i][j][bal]==1) return;
30        dp[i][j][bal]=1;
31        find(i+1,j,new int[]{open,close});
32        find(i,j+1,new int[]{open,close});
33    }
34}
35
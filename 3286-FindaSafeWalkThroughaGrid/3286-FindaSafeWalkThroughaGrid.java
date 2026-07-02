// Last updated: 7/2/2026, 5:32:31 PM
1class Solution {
2    List<List<Integer>> grid;
3    int m;
4    int n;
5    Boolean dp[][][];
6    public boolean findSafeWalk(List<List<Integer>> grid, int health) {
7        this.grid=grid;
8        this.m=grid.size();
9        this.n=grid.get(0).size();
10        this.dp=new Boolean[m][n][health+1];
11        return dfs(0,0,health);
12    }
13    public boolean dfs(int i,int j,int health){
14        if(i<0 || j<0 || i>=m || j>=n || health<=0) return false;
15        int isUnSafe = (grid.get(i).get(j) == 1)?1:0;
16        int rHealth = health - isUnSafe;
17        if(i==m-1 && j==n-1){
18            return rHealth >= 1;
19        }
20        if(dp[i][j][health]!=null) return dp[i][j][health];
21        if(grid.get(i).get(j)==1) isUnSafe=1;
22        dp[i][j][health] = false;
23        boolean check=dfs(i,j-1,rHealth) || dfs(i-1,j,rHealth) ||
24                      dfs(i+1,j,rHealth) || dfs(i,j+1,rHealth);
25        return dp[i][j][health]= check;
26    }
27}
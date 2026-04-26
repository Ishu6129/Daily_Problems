// Last updated: 4/26/2026, 7:43:45 PM
1class Solution {
2    boolean visited[][];
3    int dir[][] = {{0,1},{1,0},{-1,0},{0,-1}};
4    public boolean containsCycle(char[][] grid) {
5        int n=grid.length;
6        int m=grid[0].length;
7        visited = new boolean[n][m];
8        for(int i=0;i<n;i++){
9            for(int j=0;j<m;j++){
10                if(!visited[i][j] && check(-1,-1,i,j,grid[i][j],grid)){
11                    return true;
12                }
13            }
14        }
15        return false;
16    }
17    public boolean check(int pr,int pc,int i,int j,char ch,char[][] grid){
18        if(i<0 || i>=grid.length || j<0 || j>=grid[0].length || grid[i][j]!=ch) return false;
19        if(visited[i][j]==true) return true;
20        visited[i][j]=true;
21        for(int[] d:dir){
22            int x=i+d[0];
23            int y=j+d[1];
24            if(x==pr && y==pc) continue;
25            if(check(i,j,x,y,ch,grid)) return true;
26        }
27        return false;
28    }
29
30}
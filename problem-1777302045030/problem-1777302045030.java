// Last updated: 4/27/2026, 8:30:45 PM
1class Solution {
2    Map<Integer,int[][]> dir;
3    boolean[][] visited;
4    public boolean hasValidPath(int[][] grid) {
5        if(grid[0][0]==5) return false;
6        visited = new boolean[grid.length][grid[0].length];
7        dir=new HashMap<>();
8        dir.put(1,new int[][]{{0,-1},{0,1}});
9        dir.put(2,new int[][]{{-1,0},{1,0}});
10        dir.put(3,new int[][]{{0,-1},{1,0}});
11        dir.put(4,new int[][]{{0,1},{1,0}});
12        dir.put(5,new int[][]{{-1,0},{0,-1}});
13        dir.put(6,new int[][]{{-1,0},{0,1}});
14        return check(0,0,grid);
15    }
16    public boolean check(int i,int j,int[][] grid){
17        if(i<0 || j<0 || i>=grid.length || j>=grid[0].length || visited[i][j]) return false;
18        if(i==grid.length-1 && j==grid[0].length-1) return true;
19        visited[i][j] = true;
20        int[][] d=dir.get(grid[i][j]);
21        for(int[] m:d){
22            int x=i+m[0];
23            int y=j+m[1];
24            if(x<0 || y<0 || x>=grid.length || y>=grid[0].length) continue;
25            if(isConn(grid[x][y],-m[0],-m[1])){
26                if(check(x,y,grid)) return true;
27            }
28        }
29        return false;
30    }
31    public boolean isConn(int tp,int x,int y){
32        int[][] d=dir.get(tp);
33        for(int[] m:d){
34            if (m[0]==x && m[1]==y) return true;
35        }
36        return false;
37    }
38}
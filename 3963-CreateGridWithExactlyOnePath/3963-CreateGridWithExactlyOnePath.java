// Last updated: 10/27/2026, 10:09:10 PM
1class Solution {
2    public String[] createGrid(int m, int n) {
3        char[][] grid=new char[m][n];
4        for(char[] i:grid){
5            Arrays.fill(i,'#');
6        }
7        for(int i=0;i<n;i++){
8            grid[0][i]='.';
9        }
10        for(int i=1;i<m;i++){
11            grid[i][n-1]='.';
12        }
13        String ans[]=new String[m];
14        int idx=0;
15        for(char[] i:grid){
16            ans[idx++]=String.valueOf(i);
17        }
18        return ans;
19    }
20}
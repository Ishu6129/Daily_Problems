// Last updated: 18/01/2026, 19:35:59
1class Solution {
2    public int numMagicSquaresInside(int[][] grid) {
3        int m=grid.length;
4        int n=grid[0].length;
5        int ans=0;
6        if(n<3 || m<3) return 0;
7        for(int i=0;i<m-2;i++){
8            for(int j=0;j<n-2;j++){
9                if(check(grid,i,j))ans++;
10            }
11        }
12        return ans;
13    }
14    public boolean check(int[][] grid,int m,int n){
15        Set<Integer> set=new HashSet<>();
16        int sumc=0;
17        for(int i=m;i<m+3;i++){
18            sumc+=grid[i][n];
19        }
20        for(int i=m;i<m+3;i++){
21            int sumr=0;
22            for(int j=n;j<n+3;j++){
23                if(set.contains(grid[i][j]) || sumr>sumc || grid[i][j]<1 || grid[i][j]>9  ) return false;
24                sumr+=grid[i][j];
25                set.add(grid[i][j]);
26            }
27            if(sumr!=sumc)return false;
28        }
29        for (int j =n;j<n+3; j++) {
30            int colSum = 0;
31            for (int i=m;i<m+3;i++) {
32                colSum += grid[i][j];
33            }
34            if (colSum != sumc) return false;
35        }
36        int sumdg=0;
37        for(int i=0;i<3;i++){
38            sumdg+=grid[m+i][n+i];
39        }
40        int sumadg=0;
41        for(int i=0;i<3;i++){
42            sumadg+=grid[m+i][n+2-i];
43        }
44        if(sumc!=sumadg || sumdg!=sumc) return false;
45        return true;
46    }
47
48}
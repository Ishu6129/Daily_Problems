// Last updated: 03/04/2026, 13:31:06
1class Solution {
2    public int largestSubmatrix(int[][] matrix) {
3        int m=matrix.length;
4        int n=matrix[0].length;
5        int ans=0;
6        for(int i=1;i<m;i++){
7            for(int j=0;j<n;j++){
8                if(matrix[i][j]==1){
9                    matrix[i][j]+=matrix[i-1][j];
10                }
11            }
12        }
13        for(int i=0;i<m;i++){
14            Arrays.sort(matrix[i]);
15            for(int j=0;j<n;j++){
16                ans=Math.max(ans,matrix[i][j]*(n-j));
17            }
18        }
19        return ans;
20    }
21}
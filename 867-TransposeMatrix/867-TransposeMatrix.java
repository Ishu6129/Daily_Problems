// Last updated: 7/5/2026, 5:23:16 PM
1class Solution {
2    public int[][] transpose(int[][] matrix) {
3        int m=matrix.length;
4        int n=matrix[0].length;
5        int arr[][] =new int[n][m];
6        for(int i=0;i<m;i++){
7            for(int j=0;j<n;j++){
8                arr[j][i]=matrix[i][j];
9            }
10        }
11        return arr;
12    }
13}
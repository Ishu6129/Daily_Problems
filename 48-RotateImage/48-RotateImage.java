// Last updated: 22/03/2026, 18:13:50
1class Solution {
2    public void rotate(int[][] mat) {
3        int n=mat.length;
4        for(int i=0;i<n/2;i++){
5            for(int j=i;j<n-i-1;j++){
6              int temp=mat[i][j];
7              mat[i][j]=mat[n-j-1][i];
8              mat[n-j-1][i]=mat[n-i-1][n-j-1];
9              mat[n-i-1][n-j-1]=mat[j][n-i-1];
10              mat[j][n-i-1]=temp;
11            }
12        }
13    }
14}
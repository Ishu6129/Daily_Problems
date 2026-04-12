// Last updated: 12/04/2026, 08:48:14
1class Solution {
2    public int[] findDegrees(int[][] matrix) {
3      int ord[]=new int[matrix.length];
4      for(int i=0;i<matrix.length;i++){
5          for(int j=0;j<matrix[0].length;j++){
6              if(matrix[i][j]==1){
7                  ord[i]++;
8                  ord[j]++;
9              }
10          }
11      }
12        for(int i=0;i<ord.length;i++){
13            ord[i]/=2;
14        }
15        return ord;
16    }
17}
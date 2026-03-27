// Last updated: 27/03/2026, 13:13:05
1class Solution {
2    public boolean areSimilar(int[][] mat, int k) {
3        int rows=mat.length;
4        int cols=mat[0].length;
5        k=k%cols;
6        for(int i=0;i<rows;i++){
7            for(int j=0;j<cols;j++){
8                if(i%2==0){
9                    if(mat[i][j]!=mat[i][(k+j)%cols]) return false;
10                }
11                else{
12                    if(mat[i][j]!=mat[i][(cols+j-k)%cols]) return false;
13                }
14            }
15        }
16        return true;
17    }
18}
// Last updated: 22/03/2026, 18:18:53
1class Solution {
2    public boolean findRotation(int[][] mat, int[][] target) {
3        int n = mat.length;
4        if(check(mat,target)) return true;
5        for(int r=0;r<3;r++){
6            for(int i=0;i<n/2;i++){
7                for(int j=i;j<n-i-1;j++){
8                    int temp=mat[i][j];
9                    mat[i][j]=mat[n-j-1][i];
10                    mat[n-j-1][i]=mat[n-i-1][n-j-1];
11                    mat[n-i-1][n-j-1]=mat[j][n-i-1];
12                    mat[j][n-i-1]=temp;
13                }
14            }
15            if(check(mat,target)) return true;
16        }
17        return false;
18    }
19    public boolean check(int[][] mat,int[][] tar){
20        int n = mat.length;
21        for(int i=0;i<n;i++){
22            for(int j=0;j<n;j++){
23                if(mat[i][j]!=tar[i][j]) return false;
24            }
25        }
26        return true;
27    }
28}
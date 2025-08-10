// Last updated: 10/08/2025, 22:41:52
class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        if(mat.length==r && mat[0].length==0 ) return mat;
        if(mat.length*mat[0].length!=r*c) return mat;
        int[][] new_arr=new int[r][c]; 
        int fr=0;
        int fc=0;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                new_arr[fr][fc]=mat[i][j];
                fc++;
                if(fc==c){ 
                    fc=0;
                    fr++;
                }
            }
        }
        return new_arr;
    }
}
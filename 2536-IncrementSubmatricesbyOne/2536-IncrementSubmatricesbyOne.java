// Last updated: 14/11/2025, 21:55:50
class Solution {
    public int[][] rangeAddQueries(int n, int[][] queries) {
        int[][] grid=new int[n][n];
        for(int[] q:queries){
            for(int i=q[0];i<=q[2];i++){
                for(int j=q[1];j<=q[3];j++){
                    grid[i][j]++;
                }
            }
        }
        return grid;   
    }
}
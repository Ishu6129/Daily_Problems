// Last updated: 24/08/2025, 22:47:33
class Solution {
    public int[][] reverseSubmatrix(int[][] grid, int x, int y, int k) {
        for(int i=0;i<k/2;i++){
            for(int j=0;j<k;j++){
                int temp=grid[x+i][y+j];
                grid[x+i][y+j]=grid[x+k-i-1][y+j];
                grid[x+k-i-1][y+j]=temp;
            }
        }
        return grid;
    }
}
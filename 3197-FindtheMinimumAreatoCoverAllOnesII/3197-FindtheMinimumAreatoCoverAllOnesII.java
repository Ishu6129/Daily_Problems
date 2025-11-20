// Last updated: 20/11/2025, 14:45:23
class Solution {
    public int minimumArea(int[][] grid) {
        int mr=Integer.MAX_VALUE;
        int mxr=Integer.MIN_VALUE;
        int mc=Integer.MAX_VALUE;
        int mxc=Integer.MIN_VALUE;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    mr=Math.min(mr,i);
                    mxr=Math.max(mxr,i);
                    mc=Math.min(mc,j);
                    mxc=Math.max(mxc,j);
                }
            }
        }
        return (mxr-mr+1)*(mxc-mc+1);
    }
}
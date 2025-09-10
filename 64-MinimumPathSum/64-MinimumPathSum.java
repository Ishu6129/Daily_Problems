// Last updated: 10/09/2025, 11:57:47
class Solution {
    public int minPathSum(int[][] grid) {
        int[][] dp=new int[grid.length][grid[0].length];
        for(int[] arr:dp){
            Arrays.fill(arr,-1);
        }
        return move(grid,0,0,dp);
    }
    public int move(int[][] grid,int r,int c,int[][] dp){
        if(r==grid.length-1 && c==grid[0].length-1) return grid[r][c];
        if(r==grid.length || c==grid[0].length) return Integer.MAX_VALUE;
        if(dp[r][c]!=-1) return dp[r][c];
        int mr=move(grid,r,c+1,dp);
        int mb=move(grid,r+1,c,dp);
        return dp[r][c]=Math.min(mr,mb)+grid[r][c];
    }
}
// Last updated: 12/10/2025, 00:54:35
class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int ans=Integer.MAX_VALUE;
        int[][] dp=new int[matrix.length][matrix.length];
        for(int[] arr:dp){
            Arrays.fill(arr,-222222);
        }
        for(int col=0;col<matrix[0].length;col++){
            ans=Math.min(ans,MinPath(matrix,0,col,dp));
        }
        return ans;
    }
    public int MinPath(int[][] matrix,int cr,int cc,int[][] dp){
        if(cc<0 || cc>=matrix[0].length) return Integer.MAX_VALUE;
        if(cr==matrix.length-1){
            return matrix[cr][cc];
        }
        if(dp[cr][cc]!=-222222) return dp[cr][cc]; 
        int ld=MinPath(matrix,cr+1,cc-1,dp);
        int rd=MinPath(matrix,cr+1,cc+1,dp);
        int d=MinPath(matrix,cr+1,cc,dp);
        return dp[cr][cc]=Math.min(rd,Math.min(ld,d))+matrix[cr][cc];
    }

}
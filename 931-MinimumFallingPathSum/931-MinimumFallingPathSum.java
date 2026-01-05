// Last updated: 05/01/2026, 20:07:55
1class Solution {
2    public int minFallingPathSum(int[][] matrix) {
3        int dp[][] =new int[matrix.length][matrix[0].length];
4        int idx=0;
5        int ans=Integer.MAX_VALUE;
6        for(int[] i:dp){
7            Arrays.fill(i,-100000);
8        }
9        for(int col=0;col<matrix[0].length;col++){
10            ans=Math.min(ans,find(matrix,0,col,dp));
11        }
12        return ans;
13    }
14    public int find(int[][] matrix,int i,int j,int[][] dp){
15        if(i>=matrix.length || j>=matrix[0].length || j<0) return Integer.MAX_VALUE;
16        if(i==matrix.length-1) return matrix[i][j];
17        if(dp[i][j]!=-100000) return dp[i][j];
18        return dp[i][j]=matrix[i][j]+Math.min(find(matrix,i+1,j-1,dp),Math.min(find(matrix,i+1,j,dp),find(matrix,i+1,j+1,dp)));
19    }
20}
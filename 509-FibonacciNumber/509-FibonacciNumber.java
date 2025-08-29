// Last updated: 29/08/2025, 22:23:10
class Solution {
    public int fib(int n) {
        int[] dp=new int[n+1];
        return fibfnd(n,dp);
    }
    public static int fibfnd(int n,int[] dp){
        if(n<=1) {
            dp[n]=n;
            return n;}
        if(dp[n]!=0) return dp[n];
        
        dp[n]=fibfnd(n-1,dp)+fibfnd(n-2,dp);
        return dp[n];
    }
}
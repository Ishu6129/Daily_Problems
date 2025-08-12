// Last updated: 12/08/2025, 21:42:53
class Solution {
    private int cnt=0;
    public int climbStairs(int n) {
        int[] memo = new int[n + 1];
        return climb(0,n,memo);
    }
    public int climb(int cl,int n,int[] memo){
        if(cl==n) {
            return 1;
        }
        if(cl>n) return 0;
        if(memo[cl]!=0) return memo[cl];
        memo[cl]=climb(cl+1,n,memo)+climb(cl+2,n,memo);
        return memo[cl];
    }
}
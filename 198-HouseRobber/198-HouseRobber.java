// Last updated: 03/09/2025, 11:33:36
class Solution {
    public int rob(int[] nums) {
        int[] dp=new int[nums.length];
        Arrays.fill(dp,-1);
        return Robber(nums,0,dp);
    }

    public static int Robber(int[] arr,int idx,int[] dp){
        if(idx>=arr.length){
            return 0;
        }
        if(dp[idx]!=-1) return dp[idx];
        int rob=arr[idx]+Robber(arr,idx+2,dp);
        int nrob=Robber(arr,idx+1,dp);
        return dp[idx]=Math.max(rob,nrob);
    }
}
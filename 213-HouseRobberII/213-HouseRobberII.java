// Last updated: 03/09/2025, 22:44:51
class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if (n == 1) return nums[0];
        int[] dp1 = new int[n];
        int[] dp2 = new int[n];
        Arrays.fill(dp1, -1);
        Arrays.fill(dp2, -1);
        int ans1 = Robber(nums, 0, n - 2, dp1);
        int ans2 = Robber(nums, 1, n - 1, dp2);
        return Math.max(ans1, ans2);
    }

    public static int Robber(int[] arr, int i, int j, int[] dp) {
        if (i > j) return 0;
        if (dp[i] != -1) return dp[i];
        int rob = arr[i] + Robber(arr, i + 2, j, dp);
        int nrob = Robber(arr, i + 1, j, dp);
        return dp[i] = Math.max(rob, nrob);
    }
}

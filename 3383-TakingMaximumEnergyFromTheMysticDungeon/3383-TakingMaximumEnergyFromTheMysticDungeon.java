// Last updated: 12/10/2025, 00:53:16
class Solution {
    public int maximumEnergy(int[] energy, int k) {
        int n = energy.length;
        int[] dp = new int[n];
        int mx = Integer.MIN_VALUE;
        for (int i = n - 1; i >= 0; i--) {
            dp[i] = energy[i];
            if (i + k < n)
                dp[i] += dp[i + k];
            mx = Math.max(mx, dp[i]);
        }
        return mx;
    }
}
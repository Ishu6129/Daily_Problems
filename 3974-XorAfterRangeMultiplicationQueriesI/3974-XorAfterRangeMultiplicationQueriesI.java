// Last updated: 24/08/2025, 22:47:37
class Solution {
    static final int MOD = 1_000_000_007;

    public int xorAfterQueries(int[] nums, int[][] queries) {
        int n = nums.length;

        for (int[] q : queries) {
            int l = q[0], r = q[1], k = q[2], v = q[3];
            for (int idx = l; idx <= r; idx += k) {
                nums[idx] = (int)((long)nums[idx] * v % MOD);
            }
        }

        int result = 0;
        for (int num : nums) {
            result ^= num;
        }
        return result;
    }
}
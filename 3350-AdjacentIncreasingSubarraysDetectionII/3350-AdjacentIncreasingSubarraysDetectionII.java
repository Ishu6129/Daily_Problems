// Last updated: 26/10/2025, 16:49:01
class Solution {
    public int maxIncreasingSubarrays(List<Integer> nums) {
        int n = nums.size();
        int[] inc = new int[n];
        for (int i = n - 2; i >= 0; i--) {
            inc[i] = nums.get(i) < nums.get(i + 1) ? inc[i + 1] + 1 : 0;
        }

        int low = 1, high = n / 2, ans = 0;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (check(nums, inc, mid)) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }

    private boolean check(List<Integer> nums, int[] inc, int k) {
        int n = nums.size();
        for (int i = 0; i + 2 * k <= n; i++) {
            if (inc[i] >= k - 1 && inc[i + k] >= k - 1) {
                return true;
            }
        }
        return false;
    }
}

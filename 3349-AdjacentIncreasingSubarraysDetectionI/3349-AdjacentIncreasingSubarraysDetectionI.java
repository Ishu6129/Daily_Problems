// Last updated: 14/10/2025, 20:14:00
class Solution {
    public boolean hasIncreasingSubarrays(List<Integer> nums, int k) {
        int n = nums.size();
        for (int i = 0; i + 2 * k <= n; i++) {
            if (isIncreasing(nums, i, i + k) && isIncreasing(nums, i + k, i + 2 * k)) {
                return true;
            }
        }
        return false;
    }

    public boolean isIncreasing(List<Integer> nums, int start, int end) {
        for (int i = start + 1; i < end; i++) {
            if (nums.get(i) <= nums.get(i - 1)) {
                return false;
            }
        }
        return true;
    }
}

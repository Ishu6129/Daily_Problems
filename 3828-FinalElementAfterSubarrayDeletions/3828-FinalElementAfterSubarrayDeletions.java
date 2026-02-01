// Last updated: 01/02/2026, 15:41:14
1class Solution {
2    public int finalElement(int[] nums) {
3        return Math.max(nums[0], nums[nums.length - 1]);
4    }
5}
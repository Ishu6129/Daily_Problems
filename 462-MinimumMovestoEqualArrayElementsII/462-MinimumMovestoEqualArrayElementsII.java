// Last updated: 11/2/2026, 4:33:03 PM
1class Solution {
2    public int minMoves2(int[] nums) {
3        Arrays.sort(nums);
4        int mid=nums[nums.length/2];
5        int ans=0;
6        for(int i:nums) ans+=Math.abs(i-mid);
7        return ans;
8    }
9}
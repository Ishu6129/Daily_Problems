// Last updated: 25/01/2026, 13:20:36
1class Solution {
2    public int minimumDifference(int[] nums, int k) {
3        Arrays.sort(nums);
4        int n=nums.length;
5        int ans=Integer.MAX_VALUE;
6        for(int i=0;i<n-k+1;i++){
7            ans=Math.min(ans,(nums[i+k-1]-nums[i]));
8        }
9        return ans;
10    }
11}
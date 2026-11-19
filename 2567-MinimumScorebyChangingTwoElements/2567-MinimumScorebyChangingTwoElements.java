// Last updated: 11/19/2026, 5:46:56 PM
1class Solution {
2    public int minimizeSum(int[] nums) {
3        Arrays.sort(nums);
4        int n=nums.length;
5        int ans=Integer.MAX_VALUE;
6        int c1=nums[n-1]-nums[2];
7        int c2=nums[n-2]-nums[1];
8        int c3=nums[n-3]-nums[0];
9        ans=Math.min(ans,c1);
10        ans=Math.min(ans,c2);
11        ans=Math.min(ans,c3);
12        return ans;
13    }
14}
// Last updated: 6/6/2026, 12:47:58 PM
1class Solution {
2    public int[] leftRightDifference(int[] nums) {
3        int n=nums.length;
4        int lSum[] =new int[n];
5        int rSum[]=new int[n];
6        for(int i=1;i<n;i++){
7            lSum[i]=lSum[i-1]+nums[i-1];
8            rSum[n-i-1]=rSum[n-i]+nums[n-i];
9        }
10        int ans[] =new int[n];
11        for(int i=0;i<n;i++){
12            ans[i]=Math.abs(lSum[i]-rSum[i]);
13        }
14        return ans;
15    }
16}
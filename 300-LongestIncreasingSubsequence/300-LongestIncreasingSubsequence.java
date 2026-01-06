// Last updated: 06/01/2026, 23:27:52
1class Solution {
2    public int lengthOfLIS(int[] nums) {
3        int n=nums.length;
4        int dp[] =new int[n];
5        Arrays.fill(dp,Integer.MIN_VALUE);
6        int ans=Integer.MIN_VALUE;
7        for(int i=0;i<nums.length;i++){
8            ans=Math.max(ans,find(nums,i,dp));
9        }
10        return ans;
11    }
12    public int find(int[] nums,int idx,int[] dp){
13        if(idx>=nums.length) return Integer.MIN_VALUE;
14        if(dp[idx]!=Integer.MIN_VALUE) return dp[idx];
15        int max=1;
16        for(int i=0;i<idx;i++){
17            if(nums[i]<nums[idx]){
18                max=Math.max(max,1+find(nums,i,dp));
19            }
20        }
21        return dp[idx]=max;
22    }
23}
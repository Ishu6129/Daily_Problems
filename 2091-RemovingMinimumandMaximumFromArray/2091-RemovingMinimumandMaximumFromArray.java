// Last updated: 8/30/2026, 11:35:11 AM
1class Solution {
2    public int minimumDeletions(int[] nums) {
3        int n=nums.length;
4        int mini=0;
5        int maxi=0;
6        for(int i=1;i<n;i++){
7            if(nums[i]<nums[mini]) mini=i;
8            if(nums[i]>nums[maxi]) maxi=i;
9        }
10        int ans=Integer.MAX_VALUE;
11        ans=Math.max(mini,maxi)+1;
12        ans=Math.min(ans,(n-Math.min(mini,maxi)));
13        ans=Math.min(ans,Math.min(mini,maxi)+1+n-Math.max(mini,maxi));
14        return ans;
15    }
16}
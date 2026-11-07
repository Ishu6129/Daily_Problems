// Last updated: 11/7/2026, 9:54:14 PM
1class Solution {
2    public int arrayPairSum(int[] nums) {
3        Arrays.sort(nums);
4        int ans=0;
5        int n=nums.length;
6        for(int i=0;i<n;i+=2){
7            ans+=Math.min(nums[i],nums[i+1]);
8        }
9        return ans;
10    }
11}
// Last updated: 6/25/2026, 7:51:52 PM
1class Solution {
2    public int countMajoritySubarrays(int[] nums, int target) {
3        int n=nums.length;
4        int ans=0;
5        for(int i=0;i<n;i++){
6            int c=0;
7            for(int j=i;j<n;j++){
8                if(nums[j]==target) c++;
9                if(c>((j-i+1)/2)) ans++;
10            }
11        }
12        return ans; 
13    }
14}
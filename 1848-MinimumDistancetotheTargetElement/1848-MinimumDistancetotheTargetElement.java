// Last updated: 13/04/2026, 13:58:56
1class Solution {
2    public int getMinDistance(int[] nums, int target, int start) {
3        int ans=Integer.MAX_VALUE;
4        for(int i=0;i<nums.length;i++){
5            if(nums[i]==target){
6                ans=Math.min(ans,Math.abs(i-start));
7            }
8        }
9        return ans;
10
11    }
12}
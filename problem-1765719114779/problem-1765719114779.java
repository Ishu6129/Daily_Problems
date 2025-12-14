// Last updated: 14/12/2025, 19:01:54
1class Solution {
2    public int minStartValue(int[] nums) {
3        int ans=0;
4        int pre=0;
5        for(int i:nums){
6            pre+=i;
7            ans=Math.min(pre,ans);
8        }
9        return 1-ans;
10    }
11}
// Last updated: 29/11/2025, 19:37:43
1class Solution {
2    public int minOperations(int[] nums, int k) {
3     int ans=0;
4     for(int i:nums){
5        ans+=i;
6     }  
7     return ans%k;
8    }
9}
// Last updated: 7/17/2026, 9:55:49 PM
1class Solution {
2    public int missingNumber(int[] nums) {
3        int n=nums.length,sm=0;
4        for(int i:nums) sm+=i;
5        return (n*(n+1)/2)-sm; 
6    }
7}
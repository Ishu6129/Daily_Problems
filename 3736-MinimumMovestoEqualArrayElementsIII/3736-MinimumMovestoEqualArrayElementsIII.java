// Last updated: 11/3/2026, 3:54:07 PM
1class Solution {
2    public int minMoves(int[] nums) {
3        int n=nums.length;
4        int mx=-1;
5        int sm=0;
6        for(int i:nums){
7            if(i>mx) mx=i;
8            sm+=i;
9        }
10        return n*mx-sm;
11    }
12}
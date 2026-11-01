// Last updated: 11/1/2026, 1:19:01 PM
1class Solution {
2    public int minMoves(int[] nums) {
3        int n=nums.length;
4        int mn=Integer.MAX_VALUE;
5        int sm=0;
6        for(int i:nums){
7           if(mn>i) mn=i;
8           sm+=i;
9        }
10        return sm-mn*n;
11    }
12}
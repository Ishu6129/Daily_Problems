// Last updated: 05/12/2025, 19:21:58
1class Solution {
2    public int countPartitions(int[] nums) {
3        int sum=0;
4        for(int i:nums){
5            sum+=i;
6        }
7        return sum%2==0?nums.length-1:0;
8    }
9}
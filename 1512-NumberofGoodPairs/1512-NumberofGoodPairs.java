// Last updated: 10/02/2026, 11:57:20
1class Solution {
2    public int numIdenticalPairs(int[] nums) {
3        int[] freq=new int[101];
4        int ans=0;
5        for(int num:nums){
6            ans+=freq[num];
7            freq[num]++;
8        }
9        return ans;
10    }
11}
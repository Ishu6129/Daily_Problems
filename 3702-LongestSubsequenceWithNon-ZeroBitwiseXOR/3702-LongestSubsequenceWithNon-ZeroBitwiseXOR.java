// Last updated: 8/15/2026, 12:29:37 PM
1class Solution {
2    public int longestSubsequence(int[] nums) {
3        int n=nums.length;
4        int c=0;
5        int xor=0;
6        for(int i:nums){
7            if(i!=0){
8                xor^=i;
9                c++;
10            }
11        }
12        if(xor!=0) return n;
13        if(xor==0 && c!=0) return (n-c)+c-1;
14        return 0;
15    }
16}
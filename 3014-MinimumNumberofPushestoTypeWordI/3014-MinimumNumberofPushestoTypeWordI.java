// Last updated: 7/30/2026, 1:19:06 PM
1class Solution {
2    public int minimumPushes(String word) {
3        int n=word.length();
4        int rem=n%8;
5        int q=n/8;
6        return 8*q*(q+1)/2+rem*(q+1);
7    }
8}
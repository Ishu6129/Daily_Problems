// Last updated: 9/20/2026, 8:33:38 PM
1class Solution {
2    public int reverseDegree(String s) {
3        int sum=0;
4        int n=s.length();
5        for(int i=0;i<n;i++){
6            char ch=s.charAt(i);
7            sum+=(26-(ch-'a'))*(i+1);
8        }
9        return sum;
10    }
11}
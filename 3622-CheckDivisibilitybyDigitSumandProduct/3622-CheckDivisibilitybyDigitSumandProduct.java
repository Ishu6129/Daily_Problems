// Last updated: 8/22/2026, 11:34:27 AM
1class Solution {
2    public boolean checkDivisibility(int n) {
3        int t=n;
4        int sm=0;
5        int prod=1;
6        while(t>0){
7            int r=t%10;
8            sm+=r;
9            prod*=r;
10            t/=10;
11        }
12        return n%(sm+prod)==0;
13    }
14}
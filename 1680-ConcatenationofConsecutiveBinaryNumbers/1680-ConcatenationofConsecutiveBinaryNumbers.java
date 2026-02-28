// Last updated: 28/02/2026, 14:44:11
1class Solution {
2    public int concatenatedBinary(int n) {
3        long res=0;
4        int mod=1000000007;
5        int shift=0;
6        for(int i=1;i<=n;i++){
7            if((i&(i-1))==0) shift++;
8            res=((res<<shift)|i)%mod;
9        }
10        return (int) res;
11    }
12}
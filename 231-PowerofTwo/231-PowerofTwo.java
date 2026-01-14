// Last updated: 14/01/2026, 12:21:28
1class Solution {
2    public boolean isPowerOfTwo(int n) {
3        if(n==Integer.MIN_VALUE || n==0) return false;
4        return (n&(n-1))==0?true:false;
5    }
6}   
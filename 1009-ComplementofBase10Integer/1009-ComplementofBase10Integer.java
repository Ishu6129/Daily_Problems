// Last updated: 11/03/2026, 13:13:59
1class Solution {
2    public int bitwiseComplement(int n) {
3        if(n==0) return 1;
4        int mask= Integer.SIZE-Integer.numberOfLeadingZeros(n);
5        return (~n)&((1<<mask)-1);
6    }
7}
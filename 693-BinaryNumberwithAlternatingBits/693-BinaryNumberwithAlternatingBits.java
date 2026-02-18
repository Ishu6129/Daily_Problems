// Last updated: 18/02/2026, 11:54:57
1class Solution {
2    public boolean hasAlternatingBits(int n) {
3       int flag=n&1;
4       n=n>>1;
5       while(n>0){
6        int lsb=n&1;
7        if(flag==lsb) return false;
8        flag=lsb;
9        n=n>>1;
10       }
11       return true; 
12    }
13}
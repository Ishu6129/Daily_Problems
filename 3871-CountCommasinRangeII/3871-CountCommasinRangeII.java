// Last updated: 9/9/2026, 10:29:25 AM
1class Solution {
2    public long countCommas(long n) {
3      if(n<1000) return 0;
4      long c=0;
5      long sub=1000;
6      while(sub<=n){
7        c+=n-sub+1l;
8        sub*=1000l;
9      }
10      return c;
11    }
12}
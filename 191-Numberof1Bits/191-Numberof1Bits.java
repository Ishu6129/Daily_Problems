// Last updated: 14/01/2026, 23:10:39
1class Solution {
2    public int hammingWeight(int n) {
3        int ans=0;
4        while(n>0){
5            ans++;
6            n=n&(n-1);
7        }
8        return ans;
9    }
10}
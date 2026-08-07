// Last updated: 8/7/2026, 10:42:47 PM
1class Solution {
2    public int numTrees(int n) {
3       if(n<=1) return 1;
4       int ans=0;
5       for(int i=1;i<=n;i++) ans+=(numTrees(i-1)*numTrees(n-i));
6       return ans;
7    }
8}
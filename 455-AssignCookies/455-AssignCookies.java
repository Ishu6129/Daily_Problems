// Last updated: 11/11/2026, 10:58:32 AM
1class Solution {
2    public int findContentChildren(int[] g, int[] s) {
3        Arrays.sort(g);
4        Arrays.sort(s);
5        int n=g.length;
6        int m=s.length;
7        int i=0,j=0;
8        int ans=0;
9        while(i<n && j<m){
10            if(g[i]<=s[j]){
11                i++;
12                ans++;
13            }
14            j++;
15        }
16        return ans;
17
18    }
19}
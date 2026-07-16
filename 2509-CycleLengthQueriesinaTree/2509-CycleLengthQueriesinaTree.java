// Last updated: 7/16/2026, 10:39:59 AM
1class Solution {
2    public int[] cycleLengthQueries(int n, int[][] queries) {
3        int m=queries.length;
4        int[] ans=new int[m];
5        for (int i=0;i<m;i++) {
6            int u=queries[i][0];
7            int v=queries[i][1];
8            int cycleLength=1;
9            while (u!=v) {
10                if (u>v) {
11                    u/= 2;
12                }
13                else {
14                    v/= 2;
15                }
16                cycleLength++;
17            }
18            ans[i]=cycleLength;
19        }
20        return ans;
21    }
22}
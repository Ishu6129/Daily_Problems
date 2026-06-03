// Last updated: 6/3/2026, 1:23:14 PM
1class Solution {
2
3    public int earliestFinishTime(int[] landStart, int[] landDur,
4                                  int[] waterStart, int[] waterDur) {
5
6       int n=landStart.length;
7       int m=waterStart.length;
8       int eLand=Integer.MAX_VALUE;
9       int eWater=Integer.MAX_VALUE;
10       int ans=Integer.MAX_VALUE;
11       for(int i=0;i<n;i++){
12        eLand=Math.min(eLand,landStart[i]+landDur[i]);
13       }
14       for(int i=0;i<m;i++){
15        int tt=Math.max(eLand,waterStart[i])+waterDur[i];
16        ans=Math.min(ans,tt);
17       }
18       for(int i=0;i<m;i++){
19        eWater=Math.min(eWater,waterStart[i]+waterDur[i]);
20       }
21       for(int i=0;i<n;i++){
22        int tt=Math.max(eWater,landStart[i])+landDur[i];
23        ans=Math.min(ans,tt);
24       }
25       return ans;
26    }
27}
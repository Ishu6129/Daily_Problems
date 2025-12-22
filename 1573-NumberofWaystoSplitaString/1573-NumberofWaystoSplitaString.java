// Last updated: 23/12/2025, 01:18:13
1class Solution {
2    public int numWays(String s) {
3        int mod=1000000007;
4        int tc=0;
5        int n=s.length();
6        for (int i=0;i<n;i++) {
7            if (s.charAt(i)=='1') tc++;
8        }
9
10        if (tc%3!=0) return 0;
11
12        if (tc==0) {
13            long ans=(long)(n - 1)*(n - 2)/2;
14            return (int)(ans%mod);
15        }
16
17        int vc=tc/ 3;
18        int c=0;
19        long s1=0;
20        long s2=0;
21        for (int i=0;i<n;i++) {
22            if (s.charAt(i)=='1') c++;
23            if (c==vc)s1++;
24            else if (c==2*vc)s2++;
25        }
26        return (int)((s1*s2)%mod);
27    }
28}
29
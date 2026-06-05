// Last updated: 6/5/2026, 5:49:39 PM
1class Solution {
2    Map<String, long[]> dp;
3
4    public long totalWaviness(long l, long r) {
5        return count(r) - count(l - 1);
6    }
7
8    long count(long n) {
9        dp = new HashMap<>();
10        String str = Long.toString(n);
11        if (str.length() < 3) return 0;
12        long[] res = solve(str, 0, true, -1, -1, true);
13        return res[1];
14    }
15
16    long[] solve(String str, int pos, boolean tight,int prev2, int prev1, boolean lead) {
17        if (pos == str.length()) {
18            return lead ? new long[]{0, 0} : new long[]{1, 0};
19        }
20        String key = pos + "#" + tight + "#" + prev2 + "#" + prev1 + "#" + lead;
21        if (dp.containsKey(key)) return dp.get(key);
22        int limit = tight ? str.charAt(pos) - '0' : 9;
23        long cnt = 0, waves = 0;
24        for (int d = 0; d <= limit; d++) {
25            long add = 0;
26            int nPrev2, nPrev1;
27            if (lead) {
28                nPrev2 = -1;
29                nPrev1 = (d == 0) ? -1 : d;
30            } else {
31                nPrev2 = prev1;
32                nPrev1 = d;
33                if (prev2 >= 0 && prev1 >= 0) {
34                    if ((prev1 > prev2 && prev1 > d) ||
35                        (prev1 < prev2 && prev1 < d)) {
36                        add = 1;
37                    }
38                }
39            }
40            boolean nTight = tight && (d == limit);
41            boolean nLead = lead && (d == 0);
42            long[] nxt = solve(str, pos + 1, nTight, nPrev2, nPrev1, nLead);
43            cnt += nxt[0];
44            waves += nxt[1] + nxt[0] * add;
45        }
46        long[] ans = {cnt, waves};
47        dp.put(key, ans);
48        return ans;
49    }
50}
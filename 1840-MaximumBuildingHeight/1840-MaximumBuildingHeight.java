// Last updated: 6/20/2026, 4:58:03 PM
1class Solution {
2    public int maxBuilding(int n, int[][] nums) {
3        Arrays.sort(nums, (a, b) -> Integer.compare(a[0], b[0]));
4        int len = nums.length;
5        if (len == 0) return n - 1;
6
7        boolean isLast = nums[len - 1][0] == n;
8        int m = len + 1 + (isLast ? 0 : 1);
9
10        int[][] h = new int[m][2];
11        h[0][0] = 1;
12        h[0][1] = 0;
13
14        for (int i = 0; i < len; i++) {
15            int diff = nums[i][0] - h[i][0];
16            int ht = h[i][1] + diff;
17            h[i + 1][0] = nums[i][0];
18            h[i + 1][1] = Math.min(ht, nums[i][1]);
19        }
20
21        if (!isLast) {
22            int diff = n - h[len][0];
23            int ht = h[len][1] + diff;
24            h[len + 1][0] = n;
25            h[len + 1][1] = Math.min(ht, n - 1);
26        }
27
28        for (int i = m - 2; i >= 0; i--) {
29            int diff = h[i + 1][0] - h[i][0];
30            int ht = h[i + 1][1] + diff;
31            h[i][1] = Math.min(h[i][1], ht);
32        }
33
34        int ans = 0;
35        for (int i = 1; i < m; i++) {
36            int left = h[i - 1][0], right = h[i][0];
37            int h1 = h[i - 1][1], h2 = h[i][1];
38            int max = (right - left - Math.abs(h1 - h2)) / 2 + Math.max(h1, h2);
39            ans = Math.max(ans, max);
40        }
41
42        return ans;
43    }
44}
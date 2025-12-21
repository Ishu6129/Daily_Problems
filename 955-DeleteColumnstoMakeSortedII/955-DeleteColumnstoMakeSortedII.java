// Last updated: 21/12/2025, 20:18:37
1class Solution {
2    public int minDeletionSize(String[] strs) {
3        int n = strs.length;
4        int m = strs[0].length();
5        int deletions = 0;
6        boolean[] sorted = new boolean[n - 1];
7        for (int col = 0; col < m; col++) {
8            boolean needDelete = false;
9            for (int row = 0; row < n - 1; row++) {
10                if (!sorted[row] &&
11                    strs[row].charAt(col) > strs[row + 1].charAt(col)) {
12                    needDelete = true;
13                    break;
14                }
15            }
16            if (needDelete) {
17                deletions++;
18                continue;
19            }
20            for (int row = 0; row < n - 1; row++) {
21                if (!sorted[row] && strs[row].charAt(col) < strs[row + 1].charAt(col)) {
22                    sorted[row] = true;
23                }
24            }
25        }
26        return deletions;
27    }
28}
29
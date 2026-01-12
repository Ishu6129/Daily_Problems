// Last updated: 12/01/2026, 19:40:15
1class Solution {
2    public int minTimeToVisitAllPoints(int[][] points) {
3        int ans = 0;
4        for (int i = 1; i < points.length; i++) {
5            ans += Math.max(
6                Math.abs(points[i][0] - points[i - 1][0]),
7                Math.abs(points[i][1] - points[i - 1][1])
8            );
9        }
10        return ans;
11    }
12}
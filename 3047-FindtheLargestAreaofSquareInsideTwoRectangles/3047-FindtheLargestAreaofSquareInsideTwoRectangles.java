// Last updated: 17/01/2026, 21:49:17
1class Solution {
2    public long largestSquareArea(int[][] bottomLeft, int[][] topRight) {
3        long maxSide = 0;
4        int n = bottomLeft.length;
5        for (int i = 0; i<n; i++) {
6            for (int j = i+1; j<n; j++) {
7                int x1 = Math.max(bottomLeft[i][0], bottomLeft[j][0]);
8                int y1 = Math.max(bottomLeft[i][1], bottomLeft[j][1]);
9                int x2 = Math.min(topRight[i][0], topRight[j][0]);
10                int y2 = Math.min(topRight[i][1], topRight[j][1]);
11                long width = x2 - x1;
12                long height = y2 - y1;
13                if (width > 0 && height > 0) {
14                    long side = Math.min(width, height);
15                    maxSide = Math.max(maxSide, side);
16                }
17            }
18        }
19        return maxSide * maxSide;
20    }
21}
// Last updated: 7/1/2026, 4:02:42 PM
1class Solution {
2    int[][] dir = {{0, 1}, {0, -1}, {-1, 0}, {1, 0}};
3    public int maximumSafenessFactor(List<List<Integer>> mat) {
4        int n = mat.size();
5        Queue<int[]> q = new LinkedList<>();
6        int[][] grid = new int[n][n];
7        for (int i = 0; i < n; i++) {
8            for (int j = 0; j < n; j++) {
9                int val = mat.get(i).get(j);
10                grid[i][j] = val;
11                if (val == 1) q.add(new int[]{i, j});
12            }
13        }
14        while (!q.isEmpty()) {
15            int[] curr = q.poll();
16            int x = curr[0], y = curr[1];
17            for (int i = 0; i < 4; i++) {
18                int r = x + dir[i][0];
19                int c = y + dir[i][1];
20                if (r < 0 || r >= n || c < 0 || c >= n || grid[r][c] > 0) continue;
21                grid[r][c] = grid[x][y] + 1;
22                q.add(new int[]{r, c});
23            }
24        }
25        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> Integer.compare(b[0], a[0]));
26        pq.add(new int[]{grid[0][0], 0, 0});
27        grid[0][0] = -1;
28        while (!pq.isEmpty()) {
29            int[] curr = pq.poll();
30            int sfac = curr[0], x = curr[1], y = curr[2];
31            if (x == n - 1 && y == n - 1) return sfac - 1;
32            for (int i = 0; i < 4; i++) {
33                int r = x+dir[i][0];
34                int c = y+dir[i][1];
35                if (r < 0 || r >= n || c < 0 || c >= n || grid[r][c] < 0) continue;
36                int min = Math.min(sfac, grid[r][c]);
37                pq.add(new int[]{min, r, c});
38                grid[r][c] = -1;
39            }
40        }
41
42        return 0;
43
44    }
45}
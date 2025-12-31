// Last updated: 31/12/2025, 23:35:51
1import java.util.*;
2
3class Solution {
4    public boolean findSafeWalk(List<List<Integer>> grid, int health) {
5        int m = grid.size();
6        int n = grid.get(0).size();
7        int[][] dist = new int[m][n];
8        for (int[] row : dist) Arrays.fill(row, Integer.MAX_VALUE);
9        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[2] - b[2]);
10        int startCost = grid.get(0).get(0);
11        dist[0][0] = startCost;
12        pq.offer(new int[]{0, 0, startCost});
13        int[] dx = {1, -1, 0, 0};
14        int[] dy = {0, 0, 1, -1};
15        while (!pq.isEmpty()) {
16            int[] cur = pq.poll();
17            int x = cur[0], y = cur[1], cost = cur[2];
18            if (cost > dist[x][y]) continue;
19            if (x == m-1 && y== n-1) {
20                return cost < health;
21            }
22            for (int d = 0; d < 4; d++) {
23                int nx = x+dx[d];
24                int ny = y+dy[d];
25                if (nx < 0 || ny < 0 || nx >= m || ny >= n) continue;
26                int newCost = cost + grid.get(nx).get(ny);
27                if (newCost < dist[nx][ny]) {
28                    dist[nx][ny] = newCost;
29                    pq.offer(new int[]{nx, ny, newCost});
30                }
31            }
32        }
33
34        return false;
35    }
36}
37
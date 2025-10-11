// Last updated: 12/10/2025, 00:54:28
class Solution {
    int ans = 0;
    public int uniquePathsIII(int[][] grid) {
        int m = grid.length, n = grid[0].length, empty = 0, x = 0, y = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 0) empty++;
                if (grid[i][j] == 1) {
                    x = i;
                    y = j;
                }
            }
        }
        dfs(grid, x, y, empty+1);
        return ans;
    }

    public void dfs(int[][] grid, int i, int j, int empty) {
        int m = grid.length, n = grid[0].length;
        if (i < 0 || j < 0 || i >= m || j >= n || grid[i][j] == -1) return;
        if (grid[i][j] == 2) {
            if (empty == 0) ans++;
            return;
        }
        grid[i][j] = -1;
        empty--;
        dfs(grid, i + 1, j, empty);
        dfs(grid, i - 1, j, empty);
        dfs(grid, i, j + 1, empty);
        dfs(grid, i, j - 1, empty);
        empty++;
        grid[i][j] =0;
    }
}

// Last updated: 24/03/2026, 16:54:14
1class Solution {
2    public int[][] constructProductMatrix(int[][] grid) {
3        int m = grid.length;
4        int n = grid[0].length;
5        int mod=12345;
6        int [][] result = new int[m][n];
7        long prefix = 1;
8        for (int i = 0; i < m; i++) {
9            for(int j = 0; j < n; j++) {
10                result[i][j] = (int) prefix;
11                prefix = (prefix * grid[i][j]) % mod;
12            }
13        }
14        long suffix = 1;
15        for (int i = m - 1; i >= 0; i--) {
16            for (int j = n - 1; j >= 0; j--) {
17                result[i][j] = (int)((result[i][j] * suffix) % mod);
18                suffix = (suffix * grid[i][j]) % mod;
19            }
20        }
21        return result;
22    }
23}
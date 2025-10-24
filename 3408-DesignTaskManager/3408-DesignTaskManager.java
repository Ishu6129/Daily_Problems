// Last updated: 24/10/2025, 16:14:48
import java.util.*;

class Solution {
    public int[][] sortMatrix(int[][] grid) {
        int n = grid.length;
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int key = i - j;
                if (!map.containsKey(key)) {
                    map.put(key, new ArrayList<>());
                }
                map.get(key).add(grid[i][j]);
            }
        }
        for (int key : map.keySet()) {
            List<Integer> list = map.get(key);
            if (key >= 0) {
                list.sort(Collections.reverseOrder());
            } else {
                Collections.sort(list); 
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int key = i - j;
                grid[i][j] = map.get(key).remove(0);
            }
        }

        return grid;
    }
}

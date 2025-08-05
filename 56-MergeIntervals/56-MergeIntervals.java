// Last updated: 06/08/2025, 01:23:10
import java.util.*;

class Solution {
    public int[][] merge(int[][] intervals) {
        if (intervals.length < 2) return intervals;

        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        List<List<Integer>> List = new ArrayList<>();
        int i = 0;

        while (i < intervals.length) {
            int start = intervals[i][0];
            int end = intervals[i][1];

            while (i + 1 < intervals.length && end >= intervals[i + 1][0]) {
                i++;
                end = Math.max(end, intervals[i][1]);
            }

            List.add(Arrays.asList(start, end));
            i++;
        }

        int[][] non_overlap = new int[List.size()][2];
        for (int e = 0; e < List.size(); e++) {
            List<Integer> innerList = List.get(e);
            non_overlap[e][0] = innerList.get(0);
            non_overlap[e][1] = innerList.get(1);
        }

        return non_overlap;
    }
}

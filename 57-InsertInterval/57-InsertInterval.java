// Last updated: 01/12/2025, 19:14:16
1class Solution {
2    public int[][] insert(int[][] intervals, int[] newInterval) {
3        ArrayList<int[]> ans = new ArrayList<>();
4        for (int i = 0; i < intervals.length; i++) {
5            if (newInterval[1] < intervals[i][0]) {
6                ans.add(new int[]{newInterval[0], newInterval[1]});
7                for (int j = i; j < intervals.length; j++) {
8                    ans.add(intervals[j]);
9                }
10                int[][] res = new int[ans.size()][2];
11                for (int k = 0; k < ans.size(); k++) {
12                    res[k][0] = ans.get(k)[0];
13                    res[k][1] = ans.get(k)[1];
14                }
15                return res;
16            }
17            else if (newInterval[0] > intervals[i][1]) {
18                ans.add(intervals[i]);
19            }
20            else {
21                newInterval = new int[]{
22                    Math.min(intervals[i][0], newInterval[0]),
23                    Math.max(intervals[i][1], newInterval[1])
24                };
25            }
26        }
27        ans.add(newInterval);
28        int[][] res = new int[ans.size()][2];
29        for (int i = 0; i < ans.size(); i++) {
30            res[i][0] = ans.get(i)[0];
31            res[i][1] = ans.get(i)[1];
32        }
33        return res;
34    }
35}
36
// Last updated: 03/12/2025, 22:05:36
1class Solution {
2    public boolean wordBreak(String s, List<String> wordDict) {
3        Set<String> set = new HashSet<>(wordDict);
4        return backtrack(s, 0, set, new HashSet<>());
5    }
6
7    public boolean backtrack(String s, int start, Set<String> set, Set<Integer> failed) {
8        if (start == s.length()) return true;
9        if (failed.contains(start)) return false;
10        StringBuilder sb = new StringBuilder();
11        for (int i = start; i < s.length(); i++) {
12            sb.append(s.charAt(i));
13            if (set.contains(sb.toString())) {
14                if (backtrack(s, i + 1, set, failed)) {
15                    return true;
16                }
17            }
18        }
19        failed.add(start);
20        return false;
21    }
22}
23
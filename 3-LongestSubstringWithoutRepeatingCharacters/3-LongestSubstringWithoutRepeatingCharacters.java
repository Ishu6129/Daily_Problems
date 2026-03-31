// Last updated: 31/03/2026, 22:40:06
1class Solution {
2    public int lengthOfLongestSubstring(String s) {
3        Set<Character> set = new HashSet<>();
4        int left = 0, max = 0;
5        for (int right = 0; right < s.length(); right++) {
6            while (set.contains(s.charAt(right))) {
7                set.remove(s.charAt(left++));
8            }
9            set.add(s.charAt(right));
10            max = Math.max(max,set.size());
11        }
12        return max;
13    }
14}
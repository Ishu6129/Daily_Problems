// Last updated: 01/12/2025, 18:18:00
1class Solution {
2    public String makeFancyString(String s) {
3        char pre = '0';
4        int c = 0;
5        StringBuilder ans = new StringBuilder();
6
7        for (int i = 0; i < s.length(); i++) {
8            char ch = s.charAt(i);
9            if (pre != ch) {
10                pre = ch;
11                ans.append(ch);
12                c = 1;
13                continue;
14            }
15            if (c == 2) {
16                continue;
17            }
18            ans.append(ch);
19            c++;
20        }
21        return ans.toString();
22    }
23}
24
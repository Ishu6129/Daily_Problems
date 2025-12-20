// Last updated: 20/12/2025, 18:12:01
1class Solution {
2    public int repeatedStringMatch(String a, String b) {
3        StringBuilder sb = new StringBuilder();
4        int count = 0;
5        while (sb.length() < b.length()) {
6            sb.append(a);
7            count++;
8        }
9        if (sb.toString().contains(b)) {
10            return count;
11        }
12        sb.append(a);
13        if (sb.toString().contains(b)) {
14            return count + 1;
15        }
16        return -1;
17    }
18}
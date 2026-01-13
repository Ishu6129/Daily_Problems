// Last updated: 13/01/2026, 22:22:59
1import java.util.*;
2
3class Solution {
4    int i = 0;
5
6    public String countOfAtoms(String s) {
7        Map<String, Integer> map = solve(s);
8        TreeMap<String, Integer> tm = new TreeMap<>(map);
9        StringBuilder ans = new StringBuilder();
10        for (String k : tm.keySet()) {
11            ans.append(k);
12            if (tm.get(k) > 1) ans.append(tm.get(k));
13        }
14        return ans.toString();
15    }
16
17    private Map<String, Integer> solve(String s) {
18        Map<String, Integer> map = new HashMap<>();
19
20        while (i < s.length() && s.charAt(i) != ')') {
21            if (s.charAt(i) == '(') {
22                i++;
23                Map<String, Integer> inner = solve(s);
24                i++;
25                int mul = getNumber(s);
26                for (String k : inner.keySet()) {
27                    map.put(k, map.getOrDefault(k, 0) + inner.get(k) * mul);
28                }
29            } else {
30                String atom = getAtom(s);
31                int cnt = getNumber(s);
32                map.put(atom, map.getOrDefault(atom, 0) + cnt);
33            }
34        }
35        return map;
36    }
37
38    private String getAtom(String s) {
39        StringBuilder sb = new StringBuilder();
40        sb.append(s.charAt(i++));
41        while (i < s.length() && Character.isLowerCase(s.charAt(i))) {
42            sb.append(s.charAt(i++));
43        }
44        return sb.toString();
45    }
46
47    private int getNumber(String s) {
48        int num = 0;
49        while (i < s.length() && Character.isDigit(s.charAt(i))) {
50            num = num * 10 + (s.charAt(i++) - '0');
51        }
52        return num == 0 ? 1 : num;
53    }
54}
55
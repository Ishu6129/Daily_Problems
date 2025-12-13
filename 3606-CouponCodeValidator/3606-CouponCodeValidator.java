// Last updated: 13/12/2025, 17:48:52
1class Solution {
2    public List<String> validateCoupons(String[] code, String[] businessLine, boolean[] isActive) {
3        List<String> order = Arrays.asList(
4            "electronics", "grocery", "pharmacy", "restaurant"
5        );
6        Map<String, List<String>> map = new HashMap<>();
7        for (String b : order) {
8            map.put(b, new ArrayList<>());
9        }
10        for (int i = 0; i < code.length; i++) {
11            if (!isActive[i]) continue;
12            if (!map.containsKey(businessLine[i])) continue;
13            if (!isValidCode(code[i])) continue;
14            map.get(businessLine[i]).add(code[i]);
15        }
16        List<String> result = new ArrayList<>();
17        for (String b : order) {
18            List<String> list = map.get(b);
19            Collections.sort(list);
20            result.addAll(list);
21        }
22        return result;
23    }
24    public boolean isValidCode(String s) {
25        if (s == null || s.length() == 0) return false;
26        for (char c : s.toCharArray()) {
27            if (Character.isLetterOrDigit(c) || c == '_') continue;
28            return false;
29        }
30        return true;
31    }
32}
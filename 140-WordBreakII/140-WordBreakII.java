// Last updated: 07/01/2026, 01:12:00
1class Solution {
2    List<String> ans=new ArrayList<>();
3    public List<String> wordBreak(String s, List<String> wordDict) {
4        Set<String> set = new HashSet<>(wordDict);
5        backtrack(s, 0, set, new HashSet<>(),new StringBuilder());
6        return ans;
7    }
8
9    public void backtrack(String s, int start, Set<String> set, Set<Integer> failed,StringBuilder str) {
10        if (start == s.length()) {
11            ans.add(str.toString().trim());
12            return;
13        }
14        if (failed.contains(start)) return;
15        int blen = ans.size();
16        StringBuilder sb = new StringBuilder();
17        for (int i = start; i < s.length(); i++) {
18            sb.append(s.charAt(i));
19            if (set.contains(sb.toString())) {
20                int len = str.length();
21                str.append(sb).append(" ");
22                backtrack(s,i+1,set,failed,str);
23                str.setLength(len);
24                
25            }
26        }
27        if(ans.size()==blen) {
28            failed.add(start);
29        }
30    }
31}
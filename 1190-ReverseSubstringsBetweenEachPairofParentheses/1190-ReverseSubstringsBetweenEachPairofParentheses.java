// Last updated: 9/27/2026, 1:01:32 PM
1class Solution {
2    int i = 0;
3    public String reverseParentheses(String s) {
4        return solve(new StringBuilder(s)).toString();
5    }
6    public StringBuilder solve(StringBuilder s) {
7        StringBuilder ans = new StringBuilder();
8        while (i<s.length() && s.charAt(i)!=')') {
9            if (s.charAt(i)=='(') {
10                i++;
11                StringBuilder sb = solve(s);
12                sb.reverse();
13                ans.append(sb);
14                i++;
15            } 
16            else {
17                ans.append(s.charAt(i));
18                i++;
19            }
20        }
21        return ans;
22    }
23}
24
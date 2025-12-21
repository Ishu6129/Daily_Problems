// Last updated: 21/12/2025, 20:03:43
1class Solution {
2    public String alphabetBoardPath(String target) {
3        StringBuilder sb = new StringBuilder();
4        int cr=0;
5        int cc=0;
6        for(char ch:target.toCharArray()){
7            int r=(ch-'a')/5;
8            int c=(ch-'a')%5;
9            while (cr>r) {
10                sb.append('U');
11                cr--;
12            }
13            while (cc>c) {
14                sb.append('L');
15                cc--;
16            }
17            while (cr<r) {
18                sb.append('D');
19                cr++;
20            }
21            while (cc<c) {
22                sb.append('R');
23                cc++;
24            }
25            sb.append('!');
26        }
27        return sb.toString();
28    }
29}
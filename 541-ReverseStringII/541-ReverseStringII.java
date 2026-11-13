// Last updated: 11/13/2026, 2:32:20 PM
1class Solution {
2    public String reverseStr(String s, int k) {
3        StringBuilder ans=new StringBuilder();
4        int n=s.length();
5        for(int i=0;i<n;i++){
6            StringBuilder sb=new StringBuilder();
7            int c=k;
8            while(c>0 && i<n){
9                char ch=s.charAt(i);
10                sb.append(ch);
11                i++;
12                c--;
13            }
14            ans.append(sb.reverse());
15            c=k;
16            sb=new StringBuilder();
17            while(c>0 && i<n){
18                char ch=s.charAt(i);
19                sb.append(ch);
20                i++;
21                c--;
22            }
23            ans.append(sb);
24            i--;
25        }
26        return ans.toString();
27    }
28}
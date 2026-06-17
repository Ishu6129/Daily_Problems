// Last updated: 6/17/2026, 8:52:00 PM
1class Solution {
2    public char processStr(String s, long k) {
3        long n=0;
4        for(char ch:s.toCharArray()){
5            if(ch=='*') {
6                if(n>0) n--;;
7            }
8            else if(ch=='#') n*=2;
9            else if(ch=='%') continue;
10            else n++;
11        }
12        if(k>=n) return '.';
13        for (int i=s.length()-1;i>=0;i--) {
14            char ch = s.charAt(i);
15            if (ch=='*') n++;
16            else if(ch=='%'){
17                k=n-k-1;
18            }
19            else if(ch=='#'){
20                n/=2;
21                if(k>=n) k=k-n;
22            }
23            else n--;
24            if(n==k) return ch;
25        }
26        return '.';
27    }
28}
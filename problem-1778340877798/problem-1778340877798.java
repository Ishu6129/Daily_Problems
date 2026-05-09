// Last updated: 5/9/2026, 9:04:37 PM
1class Solution {
2    public int minFlips(String s) {
3        int n=s.length();
4        if(n<3) return 0;
5        int zeros=0;
6        int ones=0;
7        for(char ch:s.toCharArray()){
8            if(ch=='0') zeros++;
9            else ones++;
10        }
11        if(ones<=1) return 0;
12        else if(s.charAt(0)=='1' && s.charAt(n-1)=='1') return Math.min(zeros,ones-2);
13        else  if(s.charAt(0)=='0' && s.charAt(n-1)=='0') return Math.min(zeros,ones-1);
14        else if((s.charAt(0)=='1' && s.charAt(n-1)!='1') || 
15                              (s.charAt(0)!='1' && s.charAt(n-1)=='1') ) return Math.min(zeros,ones-1);
16        return Math.min(ones,zeros);
17    }
18}
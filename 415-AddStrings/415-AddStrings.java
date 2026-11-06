// Last updated: 11/6/2026, 11:34:34 PM
1class Solution {
2    public String addStrings(String num1, String num2) {
3        int n=num1.length()-1;
4        int m=num2.length()-1;
5        StringBuilder sb=new StringBuilder();
6        int c=0;
7        while(n>=0 && m>=0){
8            int n1=num1.charAt(n--)-'0';
9            int n2=num2.charAt(m--)-'0';
10            int d=(n1+n2+c)%10;
11            sb.insert(0,d+"");
12            c=(n1+n2+c)/10;
13        }
14        while(n>=0){
15            int n1=num1.charAt(n--)-'0';
16            int d=(n1+c)%10;
17            sb.insert(0,d+"");
18            c=(n1+c)/10;
19        }
20        while(m>=0){
21            int n2=num2.charAt(m--)-'0';
22            int d=(n2+c)%10;
23            sb.insert(0,d+"");
24            c=(n2+c)/10;
25        }
26        if(c!=0) sb.insert(0,c+"");
27        return sb.toString();
28    }
29}
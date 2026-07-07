// Last updated: 7/7/2026, 4:41:48 PM
1class Solution {
2    public long sumAndMultiply(int n) {
3        long x=0;
4        long sum=0;
5        int t=n;
6        while(t>0){
7            int r=t%10;
8            if(r!=0){
9                x=x*10+r;
10                sum+=r;
11            }
12            t/=10;
13        }
14        StringBuilder sb=new StringBuilder(""+x);
15        sb.reverse();
16        return (long)Integer.parseInt(sb.toString())*sum;
17    }
18}
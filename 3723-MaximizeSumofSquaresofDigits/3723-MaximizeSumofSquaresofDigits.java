// Last updated: 10/14/2026, 5:28:51 PM
1class Solution {
2    public String maxSumOfSquares(int num, int sum) {
3        if(sum>(9*num)) return "";
4        StringBuilder sb=new StringBuilder();
5        for(int i=0;i<num;i++){
6            int dig=Math.min(9,sum);
7            sb.append(dig);
8            sum-=dig;
9        }
10        return sb.toString();
11    }
12}
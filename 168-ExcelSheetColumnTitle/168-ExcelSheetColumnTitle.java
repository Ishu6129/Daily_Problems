// Last updated: 9/17/2026, 1:20:02 PM
1class Solution {
2    public String convertToTitle(int columnNumber) {
3        StringBuilder ans=new StringBuilder();
4        int t=columnNumber;
5        while(t>0){
6            t--;
7            int r=(int)(t%26);
8            ans.append((char)(65+r));
9            t/=26;
10        }
11        return ans.reverse().toString();
12    }
13}
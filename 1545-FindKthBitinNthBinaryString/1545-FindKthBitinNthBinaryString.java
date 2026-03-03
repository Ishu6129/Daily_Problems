// Last updated: 03/03/2026, 11:54:06
1class Solution {
2    public char findKthBit(int n, int k) {
3        String dp[] =new String[n+1];
4        Arrays.fill(dp,"");
5        String str=build(n,dp);
6        return str.charAt(k-1);
7    }
8    public String build(int n,String[] dp){
9        if(n==1){
10            return "0";
11        }
12        if(dp[n]!="") return dp[n];
13        String pre=build(n-1,dp);
14        StringBuilder sb=new StringBuilder(pre);
15        sb.append("1");
16        for (int i=pre.length()-1;i>=0;i--) {
17            char c=pre.charAt(i);
18            sb.append(c=='0'?'1':'0');
19        }
20        return dp[n]=sb.toString();
21    }
22}
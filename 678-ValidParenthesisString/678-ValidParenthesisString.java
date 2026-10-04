// Last updated: 10/4/2026, 11:43:19 AM
1class Solution {
2    String s;
3    int n;
4    Boolean[][] dp;
5    public boolean checkValidString(String s) {
6        this.s=s;
7        this.n=s.length();
8        dp=new Boolean[n][n];
9        return find(0,0);
10    }
11    public boolean find(int idx,int bal){
12        if(idx==n && bal==0) return true;
13        if(bal<0 || idx>=n ) return false;
14        if(dp[idx][bal]!=null) return dp[idx][bal];
15        char ch=s.charAt(idx);
16        if(ch=='('){
17            return dp[idx][bal]= find(idx+1,bal+1);
18        }
19        else if(ch==')'){
20            return dp[idx][bal]=find(idx+1,bal-1);
21        }
22        return dp[idx][bal]=(find(idx+1,bal) || find(idx+1,bal+1) ||
23               find(idx+1,bal-1));
24    }
25}
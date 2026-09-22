// Last updated: 9/22/2026, 10:42:10 AM
1class Solution {
2    Boolean dp[][];
3    String s;
4    String t;
5    int n;
6    int m;
7    public boolean isMatch(String s, String p) {
8        this.n=s.length();
9        this.m=p.length();
10        this.s=s;
11        this.t=p;
12        dp=new Boolean[n+1][m+1];
13        return check(0,0);  
14    }
15    public boolean check(int i,int j){
16        if(i==n && j==m) return true;
17        if(j==m) return false;
18        if(dp[i][j]!=null) return dp[i][j];
19        
20        if(j+1<m && t.charAt(j+1)=='*'){
21            boolean npk=check(i,j+2);
22            boolean pk= i<n && (s.charAt(i)==t.charAt(j) || t.charAt(j)=='.') && check(i+1,j);
23            return dp[i][j]=pk||npk;
24        }
25        if(i<n && (s.charAt(i)==t.charAt(j)||t.charAt(j)=='.'))
26            return dp[i][j]=check(i+1,j+1);
27
28        return dp[i][j]=false;
29    }
30}
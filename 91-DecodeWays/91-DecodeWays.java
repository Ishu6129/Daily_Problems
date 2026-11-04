// Last updated: 11/4/2026, 6:30:12 PM
1class Solution {
2    int n;
3    String s;
4    int dp[][];
5    public int numDecodings(String s) {
6        n=s.length();
7        this.s=s;
8        dp=new int[n+1][27];
9        for(int[] i:dp) Arrays.fill(i,-1);
10        return find(0,0);
11    }
12    public int find(int idx,int prev){
13        if(idx==n) return 1;
14        if(dp[idx][prev]!=-1) return dp[idx][prev];
15        int curr=s.charAt(idx)-'0';
16        int ans=0;
17        if(curr!=0) ans+=find(idx+1,curr);
18        if(prev!=0){
19            int num=prev*10+curr;
20            if(num>=10 && num<=26) ans+=find(idx+1,0);
21        }
22        return dp[idx][prev]=ans;
23    }
24}
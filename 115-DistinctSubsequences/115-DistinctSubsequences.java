// Last updated: 9/6/2026, 12:05:16 PM
1class Solution {
2    String t;
3    String s;
4    int dp[][];
5    public int numDistinct(String s, String t) {
6        this.t=t;
7        this.s=s;
8        dp=new int[s.length()][t.length()];
9        for(int[] i:dp) Arrays.fill(i,-1);
10        return subseq(0,"");
11    }
12    public int subseq(int idx,String str){
13        if(str.equals(t)) return 1;
14        int len = str.length();
15        if(idx>=s.length()) return 0;
16        if(dp[idx][len]!=-1) return dp[idx][len];
17        int pk=0;
18        if (s.charAt(idx)==t.charAt(len)) pk=subseq(idx+1,str+s.charAt(idx));
19        int npk=subseq(idx+1,str);
20        return dp[idx][len]=pk+npk;
21    }
22
23}
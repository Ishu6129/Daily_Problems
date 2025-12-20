// Last updated: 20/12/2025, 17:34:57
1class Solution {
2    public int minDistance(String word1, String word2) {
3      int[][] dp=new int[word1.length()][word2.length()];
4        for(int i=0;i<word1.length();i++){
5           for(int j=0;j<word2.length();j++){
6            dp[i][j]=-1;
7           } 
8        }
9        int fnd_lcs= lcs(word1,word2,0,0,dp);
10        return (dp.length)+(dp[0].length)-(2*fnd_lcs);
11    }
12    public int lcs(String s1,String s2,int i,int j,int[][] dp){
13        if(i==s1.length()||j==s2.length()) return 0;
14
15        if(dp[i][j]!=-1) return dp[i][j];
16        int ans=0;
17        if(s1.charAt(i)==s2.charAt(j)){
18            ans=1+lcs(s1,s2,i+1,j+1,dp);
19        }
20        else{
21            int f=lcs(s1,s2,i+1,j,dp);
22            int s=lcs(s1,s2,i,j+1,dp);
23            ans=Math.max(f,s);
24        }
25        return dp[i][j]=ans;
26    }
27}
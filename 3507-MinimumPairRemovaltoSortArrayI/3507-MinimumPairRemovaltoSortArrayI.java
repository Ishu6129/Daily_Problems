// Last updated: 22/01/2026, 22:42:46
1class Solution {
2    public int minimumDeleteSum(String s1, String s2) {
3        int n=s1.length();
4        int m=s2.length();
5        int[][] dp=new int[n][m];
6        for(int[] i:dp){
7            Arrays.fill(i,Integer.MAX_VALUE);
8        }
9        return find(s1,s2,0,0,dp);
10    }
11    public int find(String s1,String s2,int i,int j,int[][] dp){
12        if (i == s1.length()) {
13            int sum = 0;
14            for (int k = j; k < s2.length(); k++)
15                sum += s2.charAt(k);
16            return sum;
17        }
18        if (j == s2.length()) {
19            int sum = 0;
20            for (int k = i; k < s1.length(); k++)
21                sum += s1.charAt(k);
22            return sum;
23        }
24        if(dp[i][j]!=Integer.MAX_VALUE) return dp[i][j];
25        int ans=0;
26        if(s1.charAt(i)==s2.charAt(j)){
27            ans=find(s1,s2,i+1,j+1,dp);
28        }
29        else{
30            int ds1=s1.charAt(i)+find(s1,s2,i+1,j,dp);
31            int ds2=s2.charAt(j)+find(s1,s2,i,j+1,dp);
32            ans=Math.min(ds1,ds2);
33        }
34        return dp[i][j]=ans;
35    }
36}
// Last updated: 8/9/2026, 10:24:54 PM
1class Solution {
2    int dp[][][];
3    int n;
4    public int stoneGameII(int[] piles) {
5        n=piles.length;
6        dp=new int[n][n+1][2];
7        for(int i[][]:dp){
8            for(int[] j:i) Arrays.fill(j,Integer.MIN_VALUE);
9        } 
10        int diff=solve(0,1,piles,true);
11        int total = 0;
12        for (int x:piles)total+=x;
13        return (total+diff)/2;
14    }
15    public int solve(int idx,int M,int[] piles,boolean turn){
16        if(idx>=n) return 0;
17        int t = turn?1:0;
18        if(dp[idx][M][t]!=Integer.MIN_VALUE) return dp[idx][M][t];
19        int ans=turn?Integer.MIN_VALUE:Integer.MAX_VALUE;
20        int sum=0;
21        for(int X=1;X<=2*M && idx+X<=n;X++){
22            sum+=piles[idx+X-1];
23            if(turn){
24                ans=Math.max(ans,sum+solve(idx+X,Math.max(X,M),piles,false));
25            }
26            else{
27                ans=Math.min(ans,-sum+solve(idx+X,Math.max(X,M),piles,true));
28            }
29        }
30        return dp[idx][M][t]=ans;
31    }
32}
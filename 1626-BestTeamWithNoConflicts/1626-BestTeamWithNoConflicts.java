// Last updated: 7/30/2026, 4:37:36 PM
1class Solution {
2    public int bestTeamScore(int[] scores, int[] ages) {
3        int n=scores.length;
4        int[][] team=new int[n][2];
5        for(int i=0;i<n;i++){
6            team[i]=new int[]{ages[i],scores[i]};
7        }
8        Arrays.sort(team,(a,b)->{
9            if(a[0]==b[0]) return a[1]-b[1];
10            else return a[0]-b[0];
11        });
12        int dp[]=new int[n];
13        int ans=0;
14        for(int i=0;i<n;i++){
15            dp[i]=team[i][1];
16            for(int j=0;j<i;j++){
17                if(team[j][1]<=team[i][1]) dp[i]=Math.max(dp[i],dp[j]+team[i][1]);
18            }
19            ans=Math.max(ans,dp[i]);
20        }
21        return ans;
22    }
23}
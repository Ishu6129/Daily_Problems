// Last updated: 10/03/2026, 12:04:00
1class Solution {
2    int mod=(int)(1e9+7);
3    public int numberOfStableArrays(int zero, int one, int limit) {
4        int dp[][][][]=new int[2][zero+1][one+1][limit+1];
5        for(int[][][] i:dp){
6            for(int[][] j:i){
7                for(int[] k:j){
8                    Arrays.fill(k,-1);
9                }
10            }
11        }
12        return (find(zero-1,one,0,1,limit,dp)+
13                find(zero,one-1,1,1,limit,dp))%mod;
14    }
15    public int find(int zeros,int ones,int prebit,int streak,int limit,int[][][][] dp){
16        if(streak>limit) return 0;
17        if(ones==0 && zeros==0){
18            return 1;
19        }
20        if(dp[prebit][zeros][ones][streak]!=-1) return dp[prebit][zeros][ones][streak];
21        int ways=0;
22        if(prebit==0){
23            if(zeros>0){
24                ways+=find(zeros-1,ones,prebit,streak+1,limit,dp)%mod;
25            }
26            if(ones>0){
27                ways+=find(zeros,ones-1,1,1,limit,dp)%mod;
28            }
29        }
30        else{
31            if(ones>0){
32                ways+=find(zeros,ones-1,prebit,streak+1,limit,dp)%mod;
33            }
34            if(zeros>0){
35                ways+=find(zeros-1,ones,0,1,limit,dp)%mod;
36            }
37        }
38        return dp[prebit][zeros][ones][streak]=ways%mod;
39    }
40}
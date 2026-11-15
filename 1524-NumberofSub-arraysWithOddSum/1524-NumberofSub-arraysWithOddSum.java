// Last updated: 11/15/2026, 12:10:12 PM
1class Solution {
2    int n;
3    int[] arr;
4    int mod=(int)(1e9+7);
5    int ans=0;
6    Integer[][] dp;
7    public int numOfSubarrays(int[] arr) {
8        this.arr=arr;
9        n=arr.length;
10        dp = new Integer[n][2];
11        int ans = 0;
12        for (int i=0;i<n;i++) {
13            ans=(ans+find(i, 0))%mod;
14        }
15        return ans;
16    }
17    public int find(int idx,int sm){
18        if(idx==n) return 0;
19        if (dp[idx][sm]!=null) return dp[idx][sm];
20        int sum = (sm+arr[idx])%2;
21        int tk=(sum==1?1:0)+find(idx+1,sum);
22        return dp[idx][sm]=tk%mod;
23    }
24
25}
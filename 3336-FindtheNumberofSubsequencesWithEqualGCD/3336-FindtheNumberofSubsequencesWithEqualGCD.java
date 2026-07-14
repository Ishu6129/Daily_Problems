// Last updated: 7/14/2026, 9:18:01 AM
1class Solution {
2    int[] nums;
3    int[][][] dp;
4    int mod = 1000000007;
5    public int subsequencePairCount(int[] nums) {
6        this.nums=nums;
7        this.dp = new int[nums.length + 1][201][201];
8        for (int[][] i:dp){
9            for (int[] j:i) Arrays.fill(j,-1);
10        }
11        return find(0,0,0);
12    }
13    public int gcd(int a,int b){
14        if(b==0) return a;
15        return gcd(b,a%b);
16    }
17    public int find(int idx,int gcd1,int gcd2){
18        if(idx==nums.length){
19            return (gcd1!=0 && gcd1==gcd2)?1:0;
20        }
21        if(dp[idx][gcd1][gcd2]!=-1) return dp[idx][gcd1][gcd2];
22        long ans=find(idx+1,gcd1,gcd2);
23        int ngcd1=(gcd1==0)?nums[idx]:gcd(gcd1,nums[idx]);
24        ans+=find(idx+1,ngcd1,gcd2);
25        int ngcd2=(gcd2==0)?nums[idx]:gcd(gcd2,nums[idx]);
26        ans+=find(idx+1,gcd1,ngcd2);
27
28        return dp[idx][gcd1][gcd2]=(int)(ans%mod);
29
30    }
31}
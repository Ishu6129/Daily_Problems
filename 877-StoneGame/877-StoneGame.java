// Last updated: 8/2/2026, 1:48:59 PM
1class Solution {
2    int[][] dp;
3    public boolean stoneGame(int[] nums) {
4        int n=nums.length;
5        dp=new int[n][n];
6        for(int[] i:dp){
7            Arrays.fill(i,Integer.MIN_VALUE);
8        }
9        return find(0,n-1,nums)>=0;
10
11    }
12    public int find(int start,int end,int[] nums){
13        if (start==end) {
14            return nums[start];
15        }
16        if(dp[start][end]!=Integer.MIN_VALUE) return dp[start][end];
17        int pre=nums[start];
18        int a=pre-find(start+1,end,nums);
19        int last = nums[end];
20        int b=last-find(start,end-1,nums);
21        return dp[start][end]= Math.max(a,b);
22    }
23}
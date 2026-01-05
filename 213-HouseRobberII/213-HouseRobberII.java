// Last updated: 05/01/2026, 12:40:51
1class Solution {
2    public int rob(int[] nums) {
3        int n=nums.length;
4        if (n == 0) return 0;
5        if (n == 1) return nums[0];
6        int[] dp1=new int[n];
7        int[] dp2=new int[n];
8        Arrays.fill(dp1, Integer.MIN_VALUE);
9        Arrays.fill(dp2, Integer.MIN_VALUE);
10        return Math.max(find(nums,0,n-1,dp1),find(nums,1,n,dp2));
11    }
12    public int find(int[] arr,int idx,int n,int[] dp){
13        if(idx>=n) return 0;
14        if (dp[idx] != Integer.MIN_VALUE) return dp[idx];
15        int pk=arr[idx]+find(arr,idx+2,n,dp);
16        int npk=find(arr,idx+1,n,dp);
17        return dp[idx]=Math.max(pk,npk);
18    }
19}
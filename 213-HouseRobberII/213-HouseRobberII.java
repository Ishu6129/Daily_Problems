// Last updated: 05/01/2026, 12:41:15
1class Solution {
2    public int rob(int[] nums) {
3        int n=nums.length;
4        if (n == 1) return nums[0];
5        int[] dp1=new int[n];
6        int[] dp2=new int[n];
7        Arrays.fill(dp1, Integer.MIN_VALUE);
8        Arrays.fill(dp2, Integer.MIN_VALUE);
9        return Math.max(find(nums,0,n-1,dp1),find(nums,1,n,dp2));
10    }
11    public int find(int[] arr,int idx,int n,int[] dp){
12        if(idx>=n) return 0;
13        if (dp[idx] != Integer.MIN_VALUE) return dp[idx];
14        int pk=arr[idx]+find(arr,idx+2,n,dp);
15        int npk=find(arr,idx+1,n,dp);
16        return dp[idx]=Math.max(pk,npk);
17    }
18}
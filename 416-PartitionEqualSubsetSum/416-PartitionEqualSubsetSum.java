// Last updated: 03/01/2026, 13:18:58
1class Solution {
2    public boolean canPartition(int[] nums) {
3        Arrays.sort(nums);
4        int sum=0;
5        for(int i:nums){
6            sum+=i;
7        }
8        if(sum%2!=0) return false;
9        int check=sum/2;
10        Boolean[][] dp=new Boolean[nums.length][check+1];
11        return find(nums,0,check,0,dp);
12    }
13    public boolean find(int[] nums,int idx,int target,int sum,Boolean[][] dp){
14        if(sum==target) return true;
15        if(idx>=nums.length || sum>target) return false;
16        if (dp[idx][sum] != null) return dp[idx][sum];
17        boolean pk=find(nums,idx+1,target,sum+nums[idx],dp);
18        boolean np=find(nums,idx+1,target,sum,dp);
19        return dp[idx][sum]= pk||np;
20    }
21
22}
// Last updated: 5/10/2026, 8:27:36 PM
1class Solution {
2    int[] dp;
3    int target;
4    int n;
5    public int maximumJumps(int[] nums,int target){
6        this.n=nums.length;
7        this.target=target;
8        dp=new int[n];
9        Arrays.fill(dp,Integer.MIN_VALUE);
10        int ans=find(nums,0);
11        return ans==Integer.MIN_VALUE?-1:ans;
12    }
13    public int find(int[] nums,int i){
14        if(i==n-1) return 0;
15        if(dp[i]!=Integer.MIN_VALUE) return dp[i];
16        int mx=-1;
17        for(int j=i+1;j<n;j++){
18            if(Math.abs(nums[j]-nums[i])<=target){
19                int nxt=find(nums,j);
20                if(nxt!=-1) mx=Math.max(mx,1+nxt);
21            }
22        }
23        return dp[i]=mx;
24    }
25}
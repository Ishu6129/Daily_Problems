// Last updated: 5/17/2026, 11:34:13 AM
1class Solution {
2    int[] dp;
3    public boolean canReach(int[] arr, int start) {
4        dp=new int[arr.length];
5        Arrays.fill(dp,-1);
6        return find(arr,start);
7    }
8    public boolean find(int[] arr,int idx){
9        if(idx<0 || idx>=arr.length) return false;
10        if(arr[idx]==0) return true;
11        if(dp[idx]!=-1) return dp[idx]==1;
12        dp[idx]=0; 
13        boolean left=find(arr,idx-arr[idx]);
14        boolean right=find(arr,idx+arr[idx]);
15        dp[idx]=(left||right)?1:0;
16        return left || right;
17    }
18}
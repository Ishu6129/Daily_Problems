// Last updated: 6/6/2026, 12:46:14 PM
1class Solution {
2    public int[] leftRightDifference(int[] nums) {
3        int n=nums.length;
4        int lSum[] =new int[n];
5        for(int i=1;i<n;i++){
6            lSum[i]=lSum[i-1]+nums[i-1];
7        }
8        int rSum[]=new int[n];
9        for(int i=n-2;i>=0;i--){
10            rSum[i]=rSum[i+1]+nums[i+1];
11        }
12        int ans[] =new int[n];
13        for(int i=0;i<n;i++){
14            ans[i]=Math.abs(lSum[i]-rSum[i]);
15        }
16        return ans;
17    }
18}
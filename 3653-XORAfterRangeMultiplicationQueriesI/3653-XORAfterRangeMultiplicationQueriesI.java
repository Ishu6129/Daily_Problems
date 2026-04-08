// Last updated: 08/04/2026, 12:12:20
1class Solution {
2    public int xorAfterQueries(int[] nums, int[][] queries) {
3        int mod=1_000_000_007;
4        for(int[] q:queries){
5            int idx=q[0],r=q[1],k=q[2],v=q[3];
6            while(idx<=r){
7                nums[idx]=(int)(((long)nums[idx]*v)%mod);
8                idx+=k;
9            }
10        }
11        int ans=0;
12        for(int i:nums) ans^=i;
13        return ans;
14    }
15}
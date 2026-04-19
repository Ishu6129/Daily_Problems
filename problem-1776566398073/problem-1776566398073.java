// Last updated: 19/04/2026, 08:09:58
1class Solution {
2    public int firstStableIndex(int[] nums, int k) {
3        int n=nums.length;
4        for(int i=0;i<n;i++){
5            int idx=i;
6            int mx=Integer.MIN_VALUE;
7            for(int j=0;j<=idx ;j++){
8                mx=Math.max(mx,nums[j]);
9            }
10            int mn=Integer.MAX_VALUE;
11            for(int j=idx;j<n;j++){
12                mn=Math.min(mn,nums[j]);
13            }
14            int diff=mx-mn;
15            if(diff<=k) return idx;
16        }
17        return -1;
18    }
19}
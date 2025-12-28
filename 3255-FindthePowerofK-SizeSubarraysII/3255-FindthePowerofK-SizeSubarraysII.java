// Last updated: 28/12/2025, 23:44:15
1class Solution {
2    public int[] resultsArray(int[] nums, int k) {
3        int n =nums.length;
4        int[] res=new int[n-k+1];
5        int ans=1;
6        if (k==1) {
7            for (int i=0;i<n;i++) res[i]=nums[i];
8            return res;
9        }
10        for (int i=1;i<n;i++) {
11            if (nums[i]==nums[i-1]+1) ans++;
12            else ans= 1;
13            if (i >= k-1) {
14                if (ans>= k) res[i-k+1] = nums[i];
15                else res[i-k+1] = -1;
16            }
17        }
18        return res;
19    }
20}
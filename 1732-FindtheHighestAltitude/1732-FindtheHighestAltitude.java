// Last updated: 6/19/2026, 10:46:53 AM
1class Solution {
2    public int largestAltitude(int[] gain) {
3        int n=gain.length;
4        int arr[]=new int[n+1];
5        int ans=0;
6        for(int i=0;i<n;i++){
7            arr[i+1]=arr[i]+gain[i];
8            ans=Math.max(ans,arr[i+1]);
9        }
10        return ans;
11
12    }
13}
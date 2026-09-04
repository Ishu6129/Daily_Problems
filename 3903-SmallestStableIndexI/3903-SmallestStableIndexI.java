// Last updated: 9/4/2026, 2:07:09 PM
1class Solution {
2    public int firstStableIndex(int[] nums, int k) {
3        int n=nums.length;
4        int[] mx=new int[n];
5        int[] mn=new int[n];
6        mx[0]=nums[0];
7        mn[n-1]=nums[n-1];
8        for(int i=1;i<n;i++){
9            mx[i]=Math.max(nums[i],mx[i-1]);
10            mn[n-i-1]=Math.min(nums[n-i-1],mn[n-i]);
11        }
12        for(int i=0;i<n;i++){
13            if((mx[i]-mn[i])<=k) return i;
14        }
15        return -1;
16    }
17}
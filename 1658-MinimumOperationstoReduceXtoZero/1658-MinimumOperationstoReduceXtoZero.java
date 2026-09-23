// Last updated: 9/23/2026, 12:53:58 PM
1class Solution {
2    public int minOperations(int[] nums, int x) {
3        int sum=0;
4        for(int i:nums) sum+=i;
5        int target = sum-x;
6        if(target<0) return -1;
7        int n=nums.length;
8        if(target==0) return n;
9        int curr=0;
10        int l=0;
11        int ans=n;
12        for(int i=0;i<n;i++){
13            curr+=nums[i];
14            while(curr>target && l<=i){
15                curr-=nums[l];
16                l++;
17            }
18            if(curr==target){
19                ans=Math.min(ans,l+(n-i)-1);
20            }
21        }
22        return ans==n?-1:ans;
23    }
24}
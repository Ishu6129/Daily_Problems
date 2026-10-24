// Last updated: 10/24/2026, 8:35:36 PM
1class Solution {
2    public long countSubarrays(int[] nums, int minK, int maxK) {
3        long ans=0;
4        int n=nums.length;
5        int c=0;
6        for(int i=0;i<n;i++){
7            int val=nums[i];
8            if(minK<=val && val<=maxK){
9                nums[i]=++c;
10            }
11            else{
12                nums[i]=-1;
13                c=0;
14            }
15        }
16        for(int i:nums){
17            if(i!=-1) ans+=i;
18        }
19        return ans;
20    }
21}
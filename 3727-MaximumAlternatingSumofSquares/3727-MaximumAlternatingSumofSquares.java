// Last updated: 10/13/2026, 1:56:31 PM
1class Solution {
2    public long maxAlternatingSum(int[] nums) {
3        long ans=0;
4        int n=nums.length;
5        for(int i=0;i<n;i++){
6            nums[i]*=nums[i];
7        }
8        Arrays.sort(nums);
9        int md=n/2;
10        for(int i=0;i<n;i++){
11            if(i<md) ans-=nums[i];
12            else ans+=nums[i];
13        }
14        return ans;
15    }
16}
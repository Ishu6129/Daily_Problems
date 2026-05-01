// Last updated: 5/1/2026, 5:52:01 PM
1class Solution {
2    public int maxRotateFunction(int[] nums) {
3        int n=nums.length;
4        long sum=0;
5        long t_sum=0;
6        for(int i=0;i<n;i++){
7            t_sum+=nums[i];
8            sum+=(long)(i*nums[i]);
9        }
10        long ans=sum;
11        for(int i=1;i<n;i++){
12            sum+=t_sum-nums[n-i]-(n-1)*nums[n-i];
13            ans=Math.max(ans,sum);
14        }
15        return (int)ans;
16    }
17}
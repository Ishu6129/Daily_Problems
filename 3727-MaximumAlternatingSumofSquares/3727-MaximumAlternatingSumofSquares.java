// Last updated: 10/13/2026, 1:54:39 PM
1class Solution {
2    public long maxAlternatingSum(int[] nums) {
3        long ans=0;
4        int n=nums.length;
5        long[] arr=new long[n];
6        for(int i=0;i<n;i++){
7            arr[i]=(long)(nums[i]*nums[i]);
8        }
9        Arrays.sort(arr);
10        int md=n/2;
11        for(int i=0;i<n;i++){
12            if(i<md) ans-=arr[i];
13            else ans+=arr[i];
14        }
15        return ans;
16    }
17}
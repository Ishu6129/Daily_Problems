// Last updated: 6/2/2026, 12:41:42 AM
1class Solution {
2    public int subarraysDivByK(int[] nums, int k) {
3        int[] freq=new int[10001];
4        freq[0]=1;
5        int ans=0;
6        long pre=0L;
7        for(int num:nums){
8            pre+=num;
9            int rem=(int)(((pre%k)+k)%k);
10            ans+=freq[rem];
11            freq[rem]++;
12        }
13        return (int) ans;
14    }
15}
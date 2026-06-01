// Last updated: 6/2/2026, 12:39:42 AM
1class Solution {
2    public int subarraysDivByK(int[] nums, int k) {
3        Map<Integer,Long> freq=new HashMap<>();
4        freq.put(0,1L);
5        int ans=0;
6        long pre=0L;
7        for(int num:nums){
8            pre+=num;
9            int rem=(int)(((pre%k)+k)%k);
10            ans+=freq.getOrDefault(rem,0L);
11            freq.put(rem,freq.getOrDefault(rem,0L)+1);
12        }
13        return (int) ans;
14    }
15}
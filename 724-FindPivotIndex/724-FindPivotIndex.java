// Last updated: 26/11/2025, 21:29:16
1class Solution {
2    public int pivotIndex(int[] nums) {
3        int[] preSum=new int[nums.length];
4        preSum[0]=nums[0];
5        for(int i=1;i<nums.length;i++){
6            preSum[i]=preSum[i-1]+nums[i];
7        }
8        int last=preSum[preSum.length-1];
9        if(last-preSum[0]==0) return 0;
10        for(int i=1;i<preSum.length;i++){
11            if(last-preSum[i]==preSum[i-1]) return i;
12        }
13        return -1;
14    }
15}
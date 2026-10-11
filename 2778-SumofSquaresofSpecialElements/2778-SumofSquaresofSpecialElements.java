// Last updated: 10/11/2026, 1:13:55 PM
1class Solution {
2    public int sumOfSquares(int[] nums) {
3        int ans=0;
4        int n=nums.length;
5        for(int i=1;i<=n;i++){
6            if(n%i==0) ans+=(nums[i-1]*nums[i-1]);
7        }
8        return  ans;
9    }
10}
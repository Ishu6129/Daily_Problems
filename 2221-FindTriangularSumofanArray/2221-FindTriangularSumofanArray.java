// Last updated: 18/12/2025, 12:53:19
1class Solution {
2    public int triangularSum(int[] nums) {
3        int n=nums.length;
4        for(int i=0;i<n-1;i++){
5            for(int j=0;j<n-i-1;j++){
6                nums[j]=(nums[j]+nums[j+1])%10;
7            }
8        }
9        return nums[0]%10;
10    }
11}
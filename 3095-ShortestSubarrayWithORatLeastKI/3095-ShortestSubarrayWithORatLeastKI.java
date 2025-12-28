// Last updated: 28/12/2025, 11:30:22
1class Solution {
2    public int minimumSubarrayLength(int[] nums, int k) {
3        int ans=Integer.MAX_VALUE;
4        int n=nums.length;
5        for(int i=0;i<n;i++){
6            int opr=0;
7            for(int j=i;j<n;j++){
8                opr|=nums[j];
9                if(opr>=k){
10                    ans=Math.min(ans,j-i+1);
11                }
12            }
13        }
14        return (ans==Integer.MAX_VALUE)?-1:ans;
15    }
16}
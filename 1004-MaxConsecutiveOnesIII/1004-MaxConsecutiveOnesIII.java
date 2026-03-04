// Last updated: 04/03/2026, 22:45:38
1class Solution {
2    public int longestOnes(int[] nums, int k) {
3        int ans=0;
4        int i=0;
5        int c=0;
6        for(int j=0;j<nums.length;j++){
7            if(nums[j]==0) c++;
8            while(c>k){
9                if(nums[i]==0) c--;
10                i++;
11            }
12            ans=Math.max(ans,j-i+1);
13        }
14        return ans;
15    }
16}
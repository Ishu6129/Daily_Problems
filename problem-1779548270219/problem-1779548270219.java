// Last updated: 5/23/2026, 8:27:50 PM
1class Solution {
2    public int minimumSwaps(int[] nums) {
3        int zCount=0;
4        for(int i:nums){
5            if(i==0) zCount++;
6        }
7        int n=nums.length;
8        int ans=0;
9        for(int i=n-zCount;i<n;i++){
10            if(nums[i]!=0) ans++; 
11        }
12        return ans;
13    }
14}
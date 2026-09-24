// Last updated: 9/24/2026, 11:57:54 AM
1class Solution {
2    public int smallestIndex(int[] nums) {
3        int n=nums.length;
4        for(int i=0;i<n;i++){
5            int sum=0;
6            int t=nums[i];
7            while(t>0){
8                sum+=t%10;
9                t/=10;
10            }
11            if(sum==i) return i;
12        }
13        return -1;
14    }
15}
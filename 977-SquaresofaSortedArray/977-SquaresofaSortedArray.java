// Last updated: 30/01/2026, 12:36:22
1class Solution {
2    public int[] sortedSquares(int[] nums) {
3        int[] ans=new int[nums.length];
4        int pointer=nums.length-1;
5        int i=0;
6        int j=nums.length-1;
7        while(i<=j){
8            if( (nums[j]*nums[j]) > (nums[i]*nums[i]) ){
9                ans[pointer--]=(nums[j]*nums[j]);
10                j--;
11            }
12            else{
13               ans[pointer--]=(nums[i]*nums[i]);
14                i++; 
15            }
16        }
17        return ans;
18    }
19}
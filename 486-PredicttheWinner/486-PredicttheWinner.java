// Last updated: 8/1/2026, 5:10:09 PM
1class Solution {
2    public boolean predictTheWinner(int[] nums) {
3        return find(0,nums.length-1,nums)>=0;
4
5    }
6    public int find(int start,int end,int[] nums){
7        if (start==end) {
8            return nums[start];
9        }
10        int pre=nums[start];
11        int a=pre-find(start+1,end,nums);
12        int last = nums[end];
13        int b=last-find(start,end-1,nums);
14        return Math.max(a,b);
15    }
16}
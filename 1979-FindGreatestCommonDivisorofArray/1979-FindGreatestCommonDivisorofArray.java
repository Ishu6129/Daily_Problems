// Last updated: 20/03/2026, 01:20:55
1class Solution {
2    public int findGCD(int[] nums) {
3        Arrays.sort(nums);
4        int a=nums[0];
5        int b=nums[nums.length-1];
6        while(a>0 && b>0){
7            if(a>b) a=a%b;
8            else b=b%a;
9        }
10        return a==0?b:a;
11    }
12}
// Last updated: 20/03/2026, 01:13:45
1class Solution {
2    public int gcd(int a,int b){
3        if(b==0) return a;
4        return gcd(b,a%b);
5    }
6    public int findGCD(int[] nums) {
7        Arrays.sort(nums);
8        return gcd(nums[0],nums[nums.length-1]);
9    }
10}
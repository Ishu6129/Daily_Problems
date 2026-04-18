// Last updated: 18/04/2026, 10:48:15
1class Solution {
2    public int mirrorDistance(int n) {
3        return Math.abs(n-reverse(n));
4    }
5    public int reverse(int num){
6        int rev=0;
7        while(num!=0){
8            rev=rev*10+(num%10);
9            num/=10;
10        }
11        return rev;
12    }
13    
14}
// Last updated: 11/04/2026, 20:58:47
1class Solution {
2    public int countDigitOccurrences(int[] nums, int digit) {
3        int ans=0;
4        for(int i:nums){
5            int t=i;
6            while(t>0){
7                int r=t%10;
8                if(r==digit) ans++;
9                t/=10;
10            }
11        }
12        return ans;
13    }
14}
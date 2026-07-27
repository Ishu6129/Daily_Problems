// Last updated: 7/27/2026, 11:25:29 AM
1class Solution {
2    public int maxProduct(int[] nums) {
3        int f=0,s=0;
4        for(int r:nums){
5            if(f<r){
6                s=f;
7                f=r;
8            }
9            else if(s<r){
10                s=r;
11            }
12        }
13        return (f-1)*(s-1);
14    }
15}
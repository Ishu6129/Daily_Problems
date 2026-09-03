// Last updated: 9/3/2026, 3:10:47 PM
1class Solution {
2    public boolean uniformArray(int[] nums1) {
3        int minOdd=Integer.MAX_VALUE;
4        for(int i:nums1){
5            if((i&1)!=0 && minOdd>i ) minOdd=i;
6        }
7        if(minOdd==Integer.MAX_VALUE) return true;
8        for(int i:nums1){
9            if((i&1)==0 && i<minOdd) return false;
10        }
11        return true;
12    }
13}
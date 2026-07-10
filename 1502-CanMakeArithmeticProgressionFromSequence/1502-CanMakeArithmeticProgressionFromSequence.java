// Last updated: 7/10/2026, 7:09:20 PM
1class Solution {
2    public boolean canMakeArithmeticProgression(int[] arr) {
3        Arrays.sort(arr);
4        int n=arr.length;
5        if(n<=2) return true;
6        int diff=arr[1]-arr[0];
7        for(int i=1;i<n-1;i++){
8            if((arr[i+1]-arr[i])!=diff) return false;
9        }
10        return true;
11    }
12}
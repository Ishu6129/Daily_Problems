// Last updated: 7/10/2026, 7:09:34 PM
1class Solution {
2    public boolean canMakeArithmeticProgression(int[] arr) {
3        Arrays.sort(arr);
4        int n=arr.length;
5        int diff=arr[1]-arr[0];
6        for(int i=1;i<n-1;i++){
7            if((arr[i+1]-arr[i])!=diff) return false;
8        }
9        return true;
10    }
11}
// Last updated: 6/28/2026, 11:04:02 AM
1class Solution {
2    public int maximumElementAfterDecrementingAndRearranging(int[] arr) {
3        Arrays.sort(arr);
4        arr[0]=1;
5        int n=arr.length;
6        for(int i=1;i<n;i++){
7            if(arr[i-1]<arr[i]){
8                arr[i]=arr[i-1]+1;
9            }
10        }
11        return arr[n-1];
12    }
13}
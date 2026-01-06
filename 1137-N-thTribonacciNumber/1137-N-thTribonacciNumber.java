// Last updated: 06/01/2026, 17:09:38
1class Solution {
2    public int tribonacci(int n) {
3        if(n==0) return 0;
4        if(n==1 || n==2 ) return 1;
5        int[] arr=new int[n+1];
6        arr[0]=0;
7        arr[1]=1;
8        arr[2]=1;
9        for(int i=3;i<n+1;i++){
10            arr[i]=arr[i-1]+arr[i-2]+arr[i-3];
11        }
12        return arr[n];
13    }
14}
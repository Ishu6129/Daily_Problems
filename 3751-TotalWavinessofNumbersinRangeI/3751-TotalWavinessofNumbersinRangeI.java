// Last updated: 6/4/2026, 11:56:36 AM
1class Solution {
2    public int totalWaviness(int num1, int num2) {
3        int ans=0;
4        for(int i=num1;i<=num2;i++){
5            ans+=find(String.valueOf(i));
6        }
7        return ans;
8    }
9    public int find(String str){
10        char[] arr=str.toCharArray();
11        int n=arr.length;
12        int c=0;
13        for(int i=1;i<(n-1) && (i+1)<n;i++){
14            if((arr[i-1]<arr[i] && arr[i]>arr[i+1]) ||
15               (arr[i-1]>arr[i] && arr[i]<arr[i+1]) ) c++;
16        }
17        return c;
18    }
19}
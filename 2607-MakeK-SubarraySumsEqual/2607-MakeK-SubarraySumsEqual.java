// Last updated: 25/12/2025, 22:11:18
1class Solution {
2    public long makeSubKSumEqual(int[] arr, int k) {
3        int n=arr.length;
4        int g=gcd(n,k);
5        long ans=0;
6        for (int i=0;i<g;i++) {
7            int cnt=0;
8            for(int j=i;j<n;j+=g) cnt++;
9            long[] temp = new long[cnt];
10            int idx = 0;
11            for (int j=i;j<n;j+= g){ 
12                temp[idx++] = arr[j];
13            }
14            Arrays.sort(temp);
15            long median=temp[cnt/2];
16            for (long x : temp) {
17                ans+= Math.abs(x-median);
18            }
19        }
20        return ans;
21    }
22    public int gcd(int a,int b){
23        while(a!=0){
24            int temp=a;
25            a=b%a;
26            b=temp;
27        }
28        return b;
29    }
30}
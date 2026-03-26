// Last updated: 26/03/2026, 15:02:21
1class Solution {
2    long ans = Long.MIN_VALUE;
3    int[][] arr;
4    int mod=(int)1_000_000_007;
5    int m,n;
6    public int maxProductPath(int[][] grid) {
7        arr=grid;
8        m=grid.length-1;
9        n=grid[0].length-1;
10        find(0,0,1);
11        if(ans < 0) return -1;
12        return (int)(ans % mod);
13    }
14    public void find(int i,int j,long prod){
15        if(i>m || j>n)return;
16        prod*=arr[i][j];
17        if(prod==0){
18            ans=Math.max(ans,0);
19            return;
20        }
21        if(i==m && j==n){
22            if(prod>=0){
23                ans=Math.max(ans,prod);
24            }
25            return;
26        }
27        find(i,j+1,prod);
28        find(i+1,j,prod);
29    }
30}
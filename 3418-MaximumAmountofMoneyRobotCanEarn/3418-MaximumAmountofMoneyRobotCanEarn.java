// Last updated: 02/04/2026, 11:55:25
1class Solution {
2    int m,n;
3    int[][][] dp;
4    public int maximumAmount(int[][] coins) {
5        m=coins.length;
6        n=coins[0].length;
7        dp=new int[m][n][3];
8        for(int[][] i:dp){
9            for(int[] j:i){
10                Arrays.fill(j,Integer.MIN_VALUE/2);
11            }
12        }
13        return find(0,0,2,coins);
14    }
15    int[] row={0,1};
16    int[] col={1,0};
17    public int find(int i,int j,int shield,int[][] arr){
18        if(i>=m || j>=n || shield<0){
19            return Integer.MIN_VALUE/2;
20        }
21        if(i==m-1 && j==n-1){
22            if(shield>0 && arr[i][j]<0){
23                return 0;
24            }
25            return arr[i][j];
26        }
27        if(dp[i][j][shield]!=Integer.MIN_VALUE/2) return dp[i][j][shield];
28        int ans=Integer.MIN_VALUE/2;
29        for(int d=0;d<2;d++){
30            int skp=Integer.MIN_VALUE/2;
31            if(shield>0 && arr[i][j]<0){
32                skp=find(i+row[d],j+col[d],shield-1,arr);
33            }
34            
35            int nskp=arr[i][j]+find(i+row[d],j+col[d],shield,arr);
36            ans = Math.max(ans, Math.max(skp, nskp));
37        }
38        return dp[i][j][shield]=ans;
39    }
40}
// Last updated: 8/18/2026, 12:01:01 AM
1class Solution {
2    int dp[][];
3    int sum[];
4    int arr[];
5    public int stoneGameV(int[] stoneValue) {
6        int n=stoneValue.length;
7        arr=stoneValue;
8        dp=new int[n][n];
9        sum=new int[n+1];
10        for(int i=0;i<n;i++){
11            sum[i+1]=sum[i]+stoneValue[i];
12        }
13        for(int[] i:dp){
14            Arrays.fill(i,-1);
15        }
16        return find(0,n-1);
17    }
18    int find(int l,int r){
19        if(dp[l][r]!=-1) return dp[l][r];
20        int ans=0;
21        for(int m=l;m<r;m++){
22            int ls=sum[m+1]-sum[l];
23            int rs=sum[r+1]-sum[m+1];
24            if(ls<rs) ans=Math.max(ans,ls+find(l,m));
25            else if(ls>rs) ans=Math.max(ans,rs+find(m+1,r));
26            else{
27                ans=Math.max(ans,rs+Math.max(find(l,m),find(m+1,r)));
28            }
29        }
30        return dp[l][r]=ans;
31    }
32}
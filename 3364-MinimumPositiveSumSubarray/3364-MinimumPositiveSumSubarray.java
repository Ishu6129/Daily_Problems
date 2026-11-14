// Last updated: 11/14/2026, 11:34:14 AM
1class Solution {
2    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
3        int n=nums.size();
4        int[] pre=new int[n+1];
5        for(int i=1;i<=n;i++){
6            pre[i]=pre[i-1]+nums.get(i-1);
7        }
8        int mn=Integer.MAX_VALUE;
9        for(int i=0;i<n-l+1;i++){
10            for(int j=l;j<=r && (i+j)<=n;j++){
11                int sm=pre[i+j]-pre[i];
12                if(sm>0) mn=Math.min(mn,sm);
13            }
14        }
15        return mn==Integer.MAX_VALUE?-1:mn;
16    }
17}
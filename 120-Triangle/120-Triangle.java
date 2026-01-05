// Last updated: 05/01/2026, 16:07:16
1class Solution {
2    public int minimumTotal(List<List<Integer>> triangle) {
3        int[][] dp=new int[triangle.size()][triangle.size()];
4        for(int[] i:dp){
5            Arrays.fill(i,Integer.MAX_VALUE);
6        }
7        return find(triangle,0,0,dp);
8    }
9    public int find(List<List<Integer>> triangle,int r,int idx,int[][] dp){
10        if (r==triangle.size()-1) {
11            return triangle.get(r).get(idx);
12        }
13        if(dp[r][idx]!=Integer.MAX_VALUE) return dp[r][idx];
14        int i=find(triangle,r+1,idx,dp);
15        int i1=find(triangle,r+1,idx+1,dp);
16        return dp[r][idx]=triangle.get(r).get(idx)+Math.min(i,i1);
17    }
18}
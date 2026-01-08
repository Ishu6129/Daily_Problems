// Last updated: 08/01/2026, 16:00:12
1class Solution {
2    public int maxDotProduct(int[] nums1, int[] nums2) {
3        int[][] dp=new int[nums1.length][nums2.length];
4        for(int[] i:dp){
5            Arrays.fill(i,Integer.MIN_VALUE);
6        }
7        return find(nums1,nums2,0,0,dp);
8    }
9    public int find(int[] nums1,int[] nums2,int i,int j,int[][] dp){
10        if(i>=nums1.length || j>=nums2.length){
11            return Integer.MIN_VALUE;
12        }
13        if(dp[i][j]!=Integer.MIN_VALUE) return dp[i][j];
14        int tk=nums1[i]*nums2[j];
15        int tknext=find(nums1,nums2,i+1,j+1,dp);
16        if(tknext!=Integer.MIN_VALUE){
17            tk = Math.max(tk, tk+tknext);
18        }
19        int npk1=find(nums1,nums2,i+1,j,dp);
20        int npk2=find(nums1,nums2,i,j+1,dp);
21        return dp[i][j]=Math.max(tk,Math.max(npk1,npk2));
22    }
23}
// Last updated: 8/3/2026, 3:25:56 PM
1class Solution {
2    int[][][] dp;
3    int n;
4    public String stoneGameIII(int[] nums) {
5        n=nums.length;
6        dp=new int[n][3][2];
7        for(int[][] i:dp){
8            for(int[] j:i) Arrays.fill(j,Integer.MIN_VALUE);
9        }
10        int val=find(0,0,false,nums);
11        if(val==0) return "Tie";
12        if(val<0) return "Bob";
13        return "Alice";
14    }
15    public int find(int start,int pick,boolean turn,int[] nums){
16        if(start>=n) return 0;
17        int t=turn?1:0;
18        if(dp[start][pick][t]!=Integer.MIN_VALUE) return dp[start][pick][t];
19        int a;
20        if(!turn){
21            a=nums[start]+find(start+1,0,true,nums);
22            if (pick<2) {
23                a=Math.max(a,nums[start]+find(start+1,pick+1,false,nums));
24            }
25            return dp[start][pick][t]=a;
26        }
27        else{
28            a=-nums[start]+find(start+1,0,false,nums);
29            if (pick<2) {
30                a=Math.min(a,-nums[start]+find(start+1,pick+1,true,nums));
31            }
32            return dp[start][pick][t]=a;
33        }
34    }
35}
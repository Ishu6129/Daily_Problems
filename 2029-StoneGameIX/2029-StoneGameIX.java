// Last updated: 8/16/2026, 11:10:02 AM
1class Solution {
2    public boolean stoneGameIX(int[] stones) {
3        int c0=0;
4        int c1=0;
5        int c2=0;
6        for(int i:stones){
7            int md=i%3;
8            if(md==0) c0++;
9            else if(md==1) c1++;
10            else c2++;
11        }
12        if(c0%2==0) return c1>0 && c2>0;
13        return Math.abs(c1-c2)>2;
14    }
15}
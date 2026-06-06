// Last updated: 6/6/2026, 8:43:03 PM
1class Solution {
2    public long minEnergy(int n, int brightness, int[][] intervals) {
3        long btc=(brightness+2)/3;
4        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
5        long sm=0;
6        for(int i=0;i<intervals.length;i++){
7            int l=intervals[i][0];
8            int r=intervals[i][1];
9            while((i+1)<intervals.length && intervals[i+1][0]<=r){
10                r=Math.max(r,intervals[i+1][1]);
11                i++;
12            }
13            sm+=(long)(r-l+1);
14        }
15        return btc*sm;
16    }
17}
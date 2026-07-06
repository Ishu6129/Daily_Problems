// Last updated: 7/6/2026, 7:06:00 PM
1class Solution {
2    public int removeCoveredIntervals(int[][] intervals) {
3        int ans=0;
4        Arrays.sort(intervals,(a,b)->a[0]==b[0]?b[1]-a[1]:a[0]-b[0]);
5        int n=intervals.length;
6        int r=intervals[0][1];
7        for(int i=1;i<n;i++){
8            if(intervals[i][1]<=r){
9                ans++;
10            }
11            else{
12                r=intervals[i][1];
13            }
14        }
15        return n-ans;
16    }
17}
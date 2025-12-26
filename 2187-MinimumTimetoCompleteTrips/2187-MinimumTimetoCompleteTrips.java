// Last updated: 26/12/2025, 12:25:07
1class Solution {
2    public long minimumTime(int[] time, int totalTrips) {
3        Arrays.sort(time);
4        long left = 1;
5        long right=(long)time[time.length-1]*totalTrips;
6        long ans=right;
7        while(left<=right){
8            long mid=left+(right-left)/2;
9             if(check(time,mid,totalTrips)){
10                ans=mid;
11                right=mid-1;
12             }
13             else{
14                left=mid+1;
15             }
16        }
17        return ans;
18    }
19    public boolean check(int[] time,long mid,long target){
20        long c=0;
21        for(int i=0;i<time.length;i++){
22            c=c+(mid/time[i]);
23        }
24        return c>=target?true:false;
25    }
26
27}
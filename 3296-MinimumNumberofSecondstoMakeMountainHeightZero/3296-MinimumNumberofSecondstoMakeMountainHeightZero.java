// Last updated: 13/03/2026, 22:52:03
1class Solution {
2    public long minNumberOfSeconds(int mountainHeight, int[] workerTimes) {
3        long lo=1;
4        long hi=(long)(1e16);
5        while(lo<hi){
6            long mid=lo+(hi-lo)/2;
7            long total=0;
8            for(int i=0;i<workerTimes.length;i++){
9                total+=(long)(Math.sqrt((double)((mid/workerTimes[i])*2)+0.25)-0.5);
10            }
11            if(total>=mountainHeight){
12                hi=mid;
13            }
14            else lo=mid+1;
15        }
16        return lo;
17    }
18}
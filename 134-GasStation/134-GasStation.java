// Last updated: 01/01/2026, 12:09:46
1class Solution {
2    public int canCompleteCircuit(int[] gas, int[] cost) {
3        int total=0;
4        for(int i=0;i<cost.length;i++){
5            total+=gas[i]-cost[i];
6        }
7        if (total<0){
8            return -1;
9        }
10        int idx=0;
11        int curr=0;
12        for(int i=0;i<cost.length;i++){
13            curr+=gas[i]-cost[i];
14            if (curr<0){
15                curr=0;
16                idx=i+1;
17            }
18        }
19        return idx;  
20    }
21}
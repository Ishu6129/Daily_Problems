// Last updated: 6/2/2026, 9:08:59 AM
1class Solution {
2    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
3        int min=Integer.MAX_VALUE;
4        int t=0;
5        for(int i=0;i<landStartTime.length;i++){
6            for(int j=0;j<waterStartTime.length;j++){
7                t=landStartTime[i]+landDuration[i];
8                if(t<=waterStartTime[j]){
9                    t=(waterStartTime[j])+waterDuration[j];
10                }
11                else{
12                    t=t+waterDuration[j];
13                }
14                min=Math.min(min,t);
15            }
16            
17        }
18        for(int i=0;i<waterStartTime.length;i++){
19            for(int j=0;j<landStartTime.length;j++){
20                t=waterStartTime[i]+waterDuration[i];
21                if(t<=landStartTime[j]){
22                    t=(landStartTime[j])+landDuration[j];
23                }
24                else{
25                    t=t+landDuration[j];
26                }
27                min=Math.min(min,t);
28            }
29            
30        }
31        return min;
32    }
33}
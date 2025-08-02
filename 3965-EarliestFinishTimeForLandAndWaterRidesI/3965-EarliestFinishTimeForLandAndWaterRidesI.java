// Last updated: 02/08/2025, 23:10:12
class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        int min=Integer.MAX_VALUE;
        int t=0;
        for(int i=0;i<landStartTime.length;i++){
            for(int j=0;j<waterStartTime.length;j++){
                t=landStartTime[i]+landDuration[i];
                if(t<=waterStartTime[j]){
                    t=(waterStartTime[j])+waterDuration[j];
                }
                else{
                    t=t+waterDuration[j];
                }
                min=Math.min(min,t);
            }
            
        }
        for(int i=0;i<waterStartTime.length;i++){
            for(int j=0;j<landStartTime.length;j++){
                t=waterStartTime[i]+waterDuration[i];
                if(t<=landStartTime[j]){
                    t=(landStartTime[j])+landDuration[j];
                }
                else{
                    t=t+landDuration[j];
                }
                min=Math.min(min,t);
            }
            
        }
        return min;
    }
}
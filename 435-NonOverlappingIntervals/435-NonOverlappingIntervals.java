// Last updated: 12/10/2025, 00:55:08
class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals,(a, b) -> Integer.compare(a[1], b[1]));
        int c=0;
        int lap=intervals[0][1];
        for(int i=1;i<intervals.length;i++){
            if(intervals[i][0]<lap) c++;
            else{
                lap=intervals[i][1];
            }
        }
        return c;
    }
}
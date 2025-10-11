// Last updated: 12/10/2025, 00:52:54
class Solution {
    public int earliestTime(int[][] tasks) {
        int min=Integer.MAX_VALUE;
        for(int[] i: tasks){
            if(min>(i[0]+i[1])) min=(i[0]+i[1]);
        }
        return min;
    }
}
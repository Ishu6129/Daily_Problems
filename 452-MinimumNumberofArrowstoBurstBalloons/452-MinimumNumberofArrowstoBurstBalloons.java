// Last updated: 28/09/2025, 21:46:14
class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points, (a, b) -> Integer.compare(a[1], b[1]));
        int c=1;
        int arrow=points[0][1];
        for(int i=1;i<points.length;i++){
            if(arrow>=points[i][0]) continue;
            else{
                c++;
                arrow=points[i][1];
            }
        }
        return c;
    }
}
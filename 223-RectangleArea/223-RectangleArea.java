// Last updated: 08/11/2025, 19:41:10
class Solution {
    public int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        int total=((ax2-ax1)*(ay2-ay1))+((bx2-bx1)*(by2-by1));
        int xo=Math.min(ax2,bx2)-Math.max(ax1,bx1);
        int yo=Math.min(ay2,by2)-Math.max(ay1,by1);
        if(xo>0 && yo>0){
            return total-(xo*yo);
        }
        return total;
    }
}
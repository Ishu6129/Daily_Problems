// Last updated: 04/09/2025, 14:12:52
class Solution {
    public int findClosest(int x, int y, int z) {
        if(Math.abs(x-z)==Math.abs(y-z)) return 0;
        if(Math.abs(x-z)<Math.abs(y-z)) return 1;
        return 2;
    }
}
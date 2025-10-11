// Last updated: 12/10/2025, 00:53:12
class Solution {
    public int findClosest(int x, int y, int z) {
        if(Math.abs(x-z)==Math.abs(y-z)) return 0;
        if(Math.abs(x-z)<Math.abs(y-z)) return 1;
        return 2;
    }
}
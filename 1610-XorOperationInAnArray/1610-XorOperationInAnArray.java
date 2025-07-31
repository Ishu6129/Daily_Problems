// Last updated: 31/07/2025, 19:32:56
class Solution {
    public int xorOperation(int n, int start) {
        int res=0;
        for(int i=start;i<=(start+2*(n-1));i+=2){
            res^=i;
        }
        return res;
    }
}
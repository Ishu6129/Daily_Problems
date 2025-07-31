// Last updated: 31/07/2025, 19:34:10
class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n<=0){
            return false;
        }
        return (n & (n-1))==0;
    }
}
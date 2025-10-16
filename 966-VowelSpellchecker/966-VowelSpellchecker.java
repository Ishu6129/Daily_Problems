// Last updated: 16/10/2025, 17:42:02
class Solution {
    public boolean isPowerOfFour(int n) {
        if (n <= 0) return false;
        
        while (n % 4 == 0) {
            n = n / 4;
        }
        
        return n == 1;
    }
}

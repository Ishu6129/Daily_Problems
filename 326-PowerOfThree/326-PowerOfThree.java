// Last updated: 12/10/2025, 00:55:14
class Solution {
    public boolean isPowerOfThree(int n) {
        if(n <= 0) {
        return false;
    }
    while(n % 3 == 0) {
        n /= 3;
    }
    return n == 1;
    }
}
// Last updated: 19/09/2025, 18:22:36
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
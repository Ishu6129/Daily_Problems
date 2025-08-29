// Last updated: 29/08/2025, 17:25:27
class Solution {
    public long flowerGame(int n, int m) {
        long x_even = n/2;
        long x_odd = (n + 1)/2;
        long y_even = m/2;
        long y_odd = (m + 1)/2;
        return x_even * y_odd + x_odd * y_even;
    }
}
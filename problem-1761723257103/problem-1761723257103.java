// Last updated: 29/10/2025, 13:04:17
class Solution {
    public int smallestNumber(int n) {
        return (1 << (int)(Math.log(n) / Math.log(2)) + 1) - 1;
    }
}
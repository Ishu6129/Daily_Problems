// Last updated: 28/09/2025, 22:52:29
class Solution {
    public boolean isPerfectSquare(int num) {
        if (num < 2) return true;
        int i = 1;
        int j = num / 2;
        while (i <= j) {
            int mid = i+(j - i)/2;
            long sq = (long) mid*mid;
            if (sq == num) return true;
            if (sq > num) j = mid-1;
            else i = mid + 1;
        }
        return false;
    }
}

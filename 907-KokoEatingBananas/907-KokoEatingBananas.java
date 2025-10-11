// Last updated: 12/10/2025, 00:54:43
class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1, right = 0, ans = 0;
        for (int i = 0; i < piles.length; i++) {
            if (right < piles[i]) right = piles[i];
        }
        while (left <right) {
            int mid = left + (right - left) / 2;
            if (check(piles, mid, h)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
    public boolean check(int[] piles, int mid, int h) {
        int c = 0;
        for (int i = 0; i < piles.length; i++) {
            c += (piles[i] + mid - 1) / mid;
        }
        return c <h||c== h;
    }
}


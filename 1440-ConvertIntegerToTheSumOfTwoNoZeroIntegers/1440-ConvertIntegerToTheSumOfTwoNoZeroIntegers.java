// Last updated: 12/10/2025, 00:54:14
class Solution {
    public int[] getNoZeroIntegers(int n) {
        for (int a = 1; a < n; a++) {
            int b = n - a;
            if (String.valueOf(a).indexOf('0') ==-1 && String.valueOf(b).indexOf('0') ==-1)
            return new int[]{a, b};
        }
        return null;
    }
}
// Last updated: 23/10/2025, 21:25:07
class Solution {
    public boolean hasSameDigits(String s) {
        int n = s.length();
        if (n == 2) {
            return s.charAt(0) == s.charAt(1);
        }
        StringBuilder ns = new StringBuilder();
        for (int i = 0; i < n - 1; i++) {
            int a = s.charAt(i) - '0';
            int b = s.charAt(i + 1) - '0';
            int sum = (a + b) % 10;
            ns.append(sum);
        }

        return hasSameDigits(ns.toString());
    }
}

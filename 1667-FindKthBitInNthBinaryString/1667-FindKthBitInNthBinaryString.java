// Last updated: 31/07/2025, 19:32:48
class Solution {
    public char findKthBit(int n, int k) {
        String str = buildString(n);
        return str.charAt(k - 1);
    }

    public static String buildString(int n) {
        if (n == 1) {
            return "0";
        }

        String prev = buildString(n - 1);
        StringBuilder sb = new StringBuilder();
        sb.append(prev).append("1");
        
        for (int i = prev.length() - 1; i >= 0; i--) {
            char c = prev.charAt(i);
            sb.append(c == '0' ? '1' : '0');
        }
        
        return sb.toString();
    }
}
// Last updated: 12/10/2025, 00:53:37
class Solution {
    public boolean winnerOfGame(String colors) {
        int aliceMoves = 0, bobMoves = 0;
        int n = colors.length();

        for (int i = 1; i < n - 1; i++) {
            if (colors.charAt(i) == 'A' &&
                colors.charAt(i - 1) == 'A' &&
                colors.charAt(i + 1) == 'A') {
                aliceMoves++;
            }
            if (colors.charAt(i) == 'B' &&
                colors.charAt(i - 1) == 'B' &&
                colors.charAt(i + 1) == 'B') {
                bobMoves++;
            }
        }

        return aliceMoves > bobMoves;
    }
}
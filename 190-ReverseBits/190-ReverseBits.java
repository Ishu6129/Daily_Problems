// Last updated: 31/07/2025, 19:34:24
public class Solution {
    public int reverseBits(int n) {
        String str = String.format("%32s", Integer.toBinaryString(n)).replace(' ', '0');
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        long reversedLong = Long.parseLong(sb.toString(), 2);
        return (int) reversedLong;
    }
}
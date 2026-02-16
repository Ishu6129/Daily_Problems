// Last updated: 16/02/2026, 22:04:59
1public class Solution {
2    public int reverseBits(int n) {
3        String str = String.format("%32s", Integer.toBinaryString(n)).replace(' ', '0');
4        StringBuilder sb = new StringBuilder(str);
5        sb.reverse();
6        long reversedLong = Long.parseLong(sb.toString(), 2);
7        return (int) reversedLong;
8    }
9}
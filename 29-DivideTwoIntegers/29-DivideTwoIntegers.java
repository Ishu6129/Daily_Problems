// Last updated: 08/08/2025, 17:49:40
class Solution {
   public int divide(int dividend, int divisor) {
    if (dividend == Integer.MIN_VALUE && divisor == -1) {
        return Integer.MAX_VALUE;
    }
    
    boolean negative = (dividend < 0) != (divisor < 0);
    long longDividend = Math.abs((long) dividend);
    long longDivisor = Math.abs((long) divisor);
    
    int quotient = 0;
    
    while (longDividend >= longDivisor) {
        long tempDivisor = longDivisor;
        int multiple = 1;
        
        while (longDividend >= (tempDivisor << 1)) {
            tempDivisor <<= 1;
            multiple <<= 1;
        }
        
        longDividend -= tempDivisor;
        quotient += multiple;
    }
    
    return negative ? -quotient : quotient;
}
}
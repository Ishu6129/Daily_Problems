// Last updated: 10/12/2025, 17:13:08
1class Solution {
2    public boolean reorderedPowerOf2(int n) {
3        int[] digitCount = countDigits(n);
4        for (int i = 0; i <= 30; i++) {
5            int powerOfTwo = 1 << i;
6            if (Arrays.equals(digitCount, countDigits(powerOfTwo))) {
7                return true;
8            }
9        }
10        return false;
11    }
12    public int[] countDigits(int num) {
13        int[] count = new int[10];
14        while (num > 0) {
15            count[num % 10]++;
16            num /= 10;
17        }
18        return count;
19    }
20}
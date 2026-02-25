// Last updated: 25/02/2026, 10:26:16
1import java.util.*;
2
3class Solution {
4    public int[] sortByBits(int[] arr) {
5        
6        Integer[] boxed = new Integer[arr.length];
7        for (int i = 0; i < arr.length; i++) {
8            boxed[i] = arr[i];
9        }
10        Arrays.sort(boxed, (a, b) -> {
11            int bitA = Integer.bitCount(a);
12            int bitB = Integer.bitCount(b);
13            if (bitA == bitB) return a - b;
14            return bitA - bitB;
15        });
16        for (int i = 0; i < arr.length; i++) {
17            arr[i] = boxed[i];
18        }
19
20        return arr;
21    }
22}
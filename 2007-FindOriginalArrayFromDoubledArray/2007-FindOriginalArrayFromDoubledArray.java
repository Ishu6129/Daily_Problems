// Last updated: 16/01/2026, 21:43:29
1import java.util.*;
2
3class Solution {
4    public int[] findOriginalArray(int[] changed) {
5        int n = changed.length;
6        if (n % 2 != 0) return new int[0];
7        Arrays.sort(changed);
8        Map<Integer, Integer> freq = new HashMap<>();
9        for (int num : changed) {
10            freq.put(num, freq.getOrDefault(num, 0) + 1);
11        }
12        int[] original = new int[n / 2];
13        int index = 0;
14        for (int num : changed) {
15            if (freq.get(num) == 0) continue;
16            if (num == 0) {
17                if (freq.get(0) < 2) return new int[0];
18                original[index++] = 0;
19                freq.put(0, freq.get(0) - 2);
20            } else {
21                int doubled = num * 2;
22                if (!freq.containsKey(doubled) || freq.get(doubled) == 0) {
23                    return new int[0];
24                }
25                original[index++] = num;
26                freq.put(num, freq.get(num) - 1);
27                freq.put(doubled, freq.get(doubled) - 1);
28            }
29            if (index == original.length) break;
30        }
31
32        return original;
33    }
34}
35
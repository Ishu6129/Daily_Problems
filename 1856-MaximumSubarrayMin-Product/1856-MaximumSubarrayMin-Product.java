// Last updated: 23/01/2026, 12:38:51
1import java.util.*;
2
3class Solution {
4    public int maxSumMinProduct(int[] nums) {
5        int n = nums.length;
6        long MOD = 1_000_000_007;
7        long[] prefix = new long[n + 1];
8        for (int i = 0; i < n; i++) {
9            prefix[i + 1] = prefix[i] + nums[i];
10        }
11
12        Stack<Integer> stack = new Stack<>();
13        long ans = 0;
14        for (int i = 0; i <= n; i++) {
15            long curr = (i == n) ? 0 : nums[i];
16
17            while (!stack.isEmpty() && nums[stack.peek()] > curr) {
18                int idx = stack.pop();
19
20                int left = stack.isEmpty() ? 0 : stack.peek() + 1;
21                int right = i - 1;
22
23                long sum = prefix[right + 1] - prefix[left];
24                ans = Math.max(ans, sum * nums[idx]);
25            }
26            stack.push(i);
27        }
28
29        return (int) (ans % MOD);
30    }
31}
32
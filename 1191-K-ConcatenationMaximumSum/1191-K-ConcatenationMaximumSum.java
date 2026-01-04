// Last updated: 04/01/2026, 21:40:29
1class Solution {
2    public int kConcatenationMaxSum(int[] arr, int k) {
3        int mod = 1_000_000_007;
4        long oneMax = kadane(arr);
5        if (k == 1) return (int)(oneMax % mod);
6        long twoMax = kadaneTwo(arr);
7        long totalSum = 0;
8        for (int x : arr) totalSum += x;
9        long ans;
10        if (totalSum > 0) {
11            ans = twoMax + (long)(k - 2) * totalSum;
12        } else {
13            ans = twoMax;
14        }
15        ans = Math.max(ans, 0);
16        return (int)(ans % mod);
17    }
18    public long kadane(int[] arr) {
19        long curr = 0, best = 0;
20        for (int x : arr) {
21            curr = Math.max(x, curr + x);
22            best = Math.max(best, curr);
23        }
24        return best;
25    }
26    public long kadaneTwo(int[] arr) {
27        long curr = 0, best = 0;
28        for (int i = 0; i < 2; i++) {
29            for (int x : arr) {
30                curr = Math.max(x, curr + x);
31                best = Math.max(best, curr);
32            }
33        }
34        return best;
35    }
36}
37
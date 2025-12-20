// Last updated: 20/12/2025, 18:28:43
1import java.util.*;
2
3class Solution {
4    public List<List<Integer>> permute(int[] nums) {
5        List<List<Integer>> result = new ArrayList<>();
6        Arrays.sort(nums);
7        while (true) {
8            List<Integer> curr = new ArrayList<>();
9            for (int num : nums) curr.add(num);
10            result.add(curr);
11            nextpermutation(nums);
12            if (isSorted(nums)) break;
13        }
14        return result;
15    }
16    public static void nextpermutation(int[] arr) {
17        int p = -1;
18        int n = arr.length;
19        for (int i = n - 2; i >= 0; i--) {
20            if (arr[i] < arr[i + 1]) {
21                p = i;
22                break;
23            }
24        }
25        if (p == -1) {
26            Reverse(arr, 0, n - 1);
27            return;
28        }
29        int q = -1;
30        for (int i = n - 1; i > p; i--) {
31            if (arr[i] > arr[p]) {
32                q = i;
33                break;
34            }
35        }
36        int temp = arr[p];
37        arr[p] = arr[q];
38        arr[q] = temp;
39        Reverse(arr, p + 1, n - 1);
40    }
41    public static void Reverse(int[] arr, int i, int j) {
42        while (i < j) {
43            int temp = arr[i];
44            arr[i] = arr[j];
45            arr[j] = temp;
46            i++;
47            j--;
48        }
49    }
50    private boolean isSorted(int[] nums) {
51        for (int i = 0; i < nums.length - 1; i++) {
52            if (nums[i] > nums[i + 1]) return false;
53        }
54        return true;
55    }
56}
57
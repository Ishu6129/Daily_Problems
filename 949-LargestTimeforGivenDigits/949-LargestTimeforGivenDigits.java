// Last updated: 20/12/2025, 18:40:34
1class Solution {
2    public String largestTimeFromDigits(int[] arr) {
3        Arrays.sort(arr);
4        String result = "";
5        while (true) {
6            int hour = arr[0] * 10 + arr[1];
7            int minute = arr[2] * 10 + arr[3];
8            if (hour < 24 && minute < 60) {
9                String time = (arr[0] + "" + arr[1]) + ":" + (arr[2] + "" + arr[3]);
10                if (time.compareTo(result) > 0) {
11                    result = time;
12                }
13            }
14            nextpermutation(arr);
15            if (isSorted(arr)) break;
16        }
17        return result;
18    }
19    public static void nextpermutation(int[] arr) {
20        int p = -1;
21        int n = arr.length;
22        for (int i = n - 2; i >= 0; i--) {
23            if (arr[i] < arr[i + 1]) {
24                p = i;
25                break;
26            }
27        }
28        if (p == -1) {
29            Reverse(arr, 0, n - 1);
30            return;
31        }
32        int q = -1;
33        for (int i = n - 1; i > p; i--) {
34            if (arr[i] > arr[p]) {
35                q = i;
36                break;
37            }
38        }
39        int temp = arr[p];
40        arr[p] = arr[q];
41        arr[q] = temp;
42        Reverse(arr, p + 1, n - 1);
43    }
44    public static void Reverse(int[] arr, int i, int j) {
45        while (i < j) {
46            int temp = arr[i];
47            arr[i] = arr[j];
48            arr[j] = temp;
49            i++;
50            j--;
51        }
52    }
53    public boolean isSorted(int[] nums) {
54        for (int i = 0; i < nums.length - 1; i++) {
55            if (nums[i] > nums[i + 1]) return false;
56        }
57        return true;
58    }
59}
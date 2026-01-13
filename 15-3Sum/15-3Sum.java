// Last updated: 13/01/2026, 11:39:00
1class Solution {
2    public List<List<Integer>> threeSum(int[] nums) {
3        List<List<Integer>> List = new ArrayList<>();
4        Arrays.sort(nums);
5        for (int i = 0; i < nums.length - 2; i++) {
6            if (i > 0 && nums[i] == nums[i - 1]) {
7                continue;
8            }
9            int j = i + 1;
10            int k = nums.length - 1;
11            while (j < k) {
12                int sum = nums[i] + nums[j] + nums[k];
13                if (sum == 0) {
14                    List.add(Arrays.asList(nums[i], nums[j], nums[k]));
15                    while (j < k && nums[j] == nums[j + 1]) {
16                        j++;
17                    }
18                    while (j < k && nums[k] == nums[k - 1]) {
19                        k--;
20                    }
21                    j++;
22                    k--;
23                } else if (sum < 0) {
24                    j++;
25                } else {
26                    k--;
27                }
28            }
29        }
30        return List;
31    }
32}
// Last updated: 8/11/2026, 12:09:02 PM
1class Solution {
2    public int missingInteger(int[] nums) {
3        int n = nums.length;
4        Set<Integer> set = new HashSet<>(n);
5
6        for (int num : nums)
7            set.add(num);
8        int sum = nums[0];
9
10        for (int i = 1; i < n; i++) {
11            if (nums[i] == nums[i - 1] + 1)
12                sum += nums[i];
13            else break;
14        }
15        while (set.contains(sum))
16            sum++;
17
18        return sum;
19    }
20}
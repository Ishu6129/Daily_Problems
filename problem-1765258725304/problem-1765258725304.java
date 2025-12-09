// Last updated: 09/12/2025, 11:08:45
1class Solution {
2    public int specialTriplets(int[] nums) {
3        HashMap<Integer,Integer> map1 = new HashMap<>();
4        for (int i : nums) {
5            map1.put(i, map1.getOrDefault(i, 0) + 1);
6        }
7        HashMap<Integer,Integer> map2 = new HashMap<>();
8        long ans = 0;
9        int mod = (int)1e9 + 7;
10        for (int i = 0; i < nums.length; i++) {
11            map1.put(nums[i], map1.get(nums[i]) - 1);
12            int c1 = map1.getOrDefault(nums[i] * 2, 0);
13            int c2 = map2.getOrDefault(nums[i] * 2, 0);
14            ans = (ans + (long)c1 * c2) % mod;
15            map2.put(nums[i], map2.getOrDefault(nums[i], 0) + 1);
16        }
17        return (int)ans;
18    }
19}
20
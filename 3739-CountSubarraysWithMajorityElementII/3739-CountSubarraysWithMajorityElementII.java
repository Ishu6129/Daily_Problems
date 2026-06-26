// Last updated: 6/26/2026, 6:54:11 PM
1class Solution {
2    public long countMajoritySubarrays(int[] nums, int target) {
3        int n = nums.length;
4        int len = 2*n + 2;
5        long[] countAtSum = new long[len];
6        long[] cumulativeCount = new long[len];
7
8        int idx = n+1;
9        countAtSum[idx] = 1;
10        cumulativeCount[idx] = 1;
11
12        long ans = 0;
13
14        for(int num : nums) {
15            if(num==target)
16                idx++;
17            else idx--;
18            countAtSum[idx]++;
19            ans += cumulativeCount[idx-1];
20            cumulativeCount[idx] = cumulativeCount[idx-1] + countAtSum[idx];
21        }
22
23        return ans;
24    }
25}
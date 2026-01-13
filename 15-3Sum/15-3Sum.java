// Last updated: 13/01/2026, 11:42:50
1class Solution {
2    public List<List<Integer>> threeSum(int[] nums) {
3        List<List<Integer>> ans = new ArrayList<>();
4        Arrays.sort(nums);
5        for (int i=0;i<nums.length-2;i++) {
6            if (i > 0 && nums[i] == nums[i - 1]) {
7                continue;
8            }
9            int j = i + 1;
10            int k = nums.length - 1;
11            while (j < k) {
12                int sum=nums[i]+nums[j]+nums[k];
13                if (sum==0) {
14                    ans.add(Arrays.asList(nums[i], nums[j], nums[k]));
15                    while (j<k && nums[j]==nums[j+1]){
16                        j++;
17                    }
18                    while (j<k && nums[k]==nums[k - 1]){
19                        k--;
20                    }
21                    j++;
22                    k--;
23                }
24                else if(sum<0) {
25                    j++;
26                } 
27                else{
28                    k--;
29                }
30            }
31        }
32        return ans;
33    }
34}
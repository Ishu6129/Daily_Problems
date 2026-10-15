// Last updated: 10/15/2026, 10:32:19 AM
1class Solution {
2    public int sumCounts(List<Integer> nums) {
3        int n=nums.size();
4        int ans=0;
5        for(int i=0;i<n;i++){
6            Set<Integer> set=new HashSet<>();
7            for(int j=i;j<n;j++){
8                set.add(nums.get(j));
9                ans+=(set.size()*set.size());
10            }
11        }
12        return ans;
13    }
14}
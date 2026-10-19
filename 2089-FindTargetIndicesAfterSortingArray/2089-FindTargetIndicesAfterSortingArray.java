// Last updated: 10/19/2026, 7:55:23 PM
1class Solution {
2    public List<Integer> targetIndices(int[] nums, int target) {
3        int n=nums.length;
4        Arrays.sort(nums);
5        List<Integer> ans=new ArrayList<>();
6        boolean flag=false;
7        for(int i=0;i<n;i++){
8            if(nums[i]==target){
9                ans.add(i);
10                flag=true;
11                continue;
12            }
13            if(flag) return ans;
14        }
15        return ans;
16    }
17}
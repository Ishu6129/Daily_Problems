// Last updated: 8/12/2026, 10:19:24 AM
1class Solution {
2    public int maxSubarrayLength(int[] nums, int k) {
3        Map<Integer,Integer> map=new HashMap<>();
4        int ans=0;
5        int i=0;
6        int j=0;
7        int n=nums.length;
8        while(i<n && j<n){
9            map.put(nums[j], map.getOrDefault(nums[j],0)+1);
10            while(map.get(nums[j])>k){
11                map.put(nums[i],map.get(nums[i])-1);
12                i++;
13            }
14            ans=Math.max(ans,j-i+1);
15            j++;
16        }
17        return ans;
18    }
19}
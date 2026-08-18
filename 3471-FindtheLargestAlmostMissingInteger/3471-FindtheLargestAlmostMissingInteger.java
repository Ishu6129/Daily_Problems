// Last updated: 8/18/2026, 10:47:17 AM
1class Solution {
2    public int largestInteger(int[] nums, int k) {
3        int n=nums.length;
4        Map<Integer,Integer> map=new HashMap<>();
5        for(int i=0;i<n-k+1;i++){
6            Set<Integer> set=new HashSet<>();
7            for(int j=0;j<k;j++)set.add(nums[i+j]);
8            for(int s:set) map.put(s,map.getOrDefault(s,0)+1);
9        }
10        int ans=-1;
11        for(int i:map.keySet())
12            if(map.get(i)==1) ans=Math.max(ans,i);
13        return ans;
14    }
15}
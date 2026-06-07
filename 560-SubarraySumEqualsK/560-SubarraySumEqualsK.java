// Last updated: 6/7/2026, 8:10:35 PM
1class Solution {
2    public int subarraySum(int[] nums, int k) {
3        Map<Integer,Integer> map=new HashMap<>();
4        int pre=0;
5        int cnt=0;
6        map.put(0,1);
7        for(int i=0;i<nums.length;i++){
8            pre+=nums[i];
9            int rm=pre-k;
10            if(map.containsKey(rm)){
11                cnt+= map.get(rm);
12            }
13            map.put(pre, map.getOrDefault(pre, 0) + 1);
14        }
15        return cnt;
16    }
17}
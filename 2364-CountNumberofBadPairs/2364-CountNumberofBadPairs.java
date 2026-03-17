// Last updated: 17/03/2026, 12:47:12
1class Solution {
2    public long countBadPairs(int[] nums) {
3        int n=nums.length;
4        long tp=(long)n*(n-1)/2;
5        HashMap<Integer,Integer> map=new HashMap<>();
6        for(int i=0;i<n;i++){
7            int key=nums[i]-i;
8            map.put(key,map.getOrDefault(key,0)+1);
9        }
10        long cp=0;
11        for(int key:map.keySet()){
12            long f=map.get(key);
13            cp += f*(f-1)/2;
14        }
15        return tp-cp;
16    }
17}
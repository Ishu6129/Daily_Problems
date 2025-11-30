// Last updated: 30/11/2025, 22:19:55
1class Solution {
2    public int countElements(int[] nums, int k) {
3        int ans=0;
4        Map<Integer,Integer> map=new HashMap<>();
5        for(int i:nums){
6            map.put(i,map.getOrDefault(i,0)+1);
7        }
8        int t=nums.length;
9        for(int i:map.keySet()){
10            t-=map.get(i);
11            if(t>=k) ans+=map.get(i);
12        }
13        return ans;
14    }
15}
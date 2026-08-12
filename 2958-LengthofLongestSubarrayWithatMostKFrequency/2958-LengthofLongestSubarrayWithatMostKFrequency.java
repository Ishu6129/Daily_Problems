// Last updated: 8/12/2026, 10:17:20 AM
1class Solution {
2    public int maxSubarrayLength(int[] nums, int k) {
3        Map<Integer,Integer> map=new HashMap<>();
4        int ans=0;
5        int i=0;
6        int j=0;
7        int n=nums.length;
8        while(i<n && j<n){
9            map.putIfAbsent(nums[j],0);
10            map.put(nums[j],map.get(nums[j])+1);
11            if(map.containsKey(nums[j])){
12                while(map.get(nums[j])>k){
13                    map.put(nums[i],map.get(nums[i])-1);
14                    i++;
15                }
16            }
17            ans=Math.max(ans,j-i+1);
18            j++;
19        }
20        return ans;
21    }
22}
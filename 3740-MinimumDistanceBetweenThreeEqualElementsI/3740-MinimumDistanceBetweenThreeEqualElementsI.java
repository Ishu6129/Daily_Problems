// Last updated: 10/04/2026, 15:29:24
1class Solution {
2    public int minimumDistance(int[] nums) {
3        Map<Integer,List<Integer>> map=new HashMap<>();
4        int n=nums.length;
5        for(int i=0;i<n;i++){
6            if(!map.containsKey(nums[i])) map.put(nums[i],new ArrayList<>());
7            map.get(nums[i]).add(i);
8        }
9        int ans=Integer.MAX_VALUE;
10        for(int i:map.keySet()){
11            List<Integer> arr=map.get(i);
12            if(arr.size()>=3){
13                for(int j=0;j<arr.size()-2;j++){
14                    ans=Math.min(ans,(arr.get(j+1)-arr.get(j))+
15                                     (arr.get(j+2)-arr.get(j+1))+
16                                     (arr.get(j+2)-arr.get(j)));
17                }
18            }
19        }
20        return ans==Integer.MAX_VALUE?-1:ans;
21    }
22}
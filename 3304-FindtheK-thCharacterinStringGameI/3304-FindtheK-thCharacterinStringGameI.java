// Last updated: 28/11/2025, 15:43:26
1class Solution {
2    public int findLucky(int[] arr) {
3        Map<Integer,Integer> map=new HashMap<>();
4        for(int i:arr){
5            map.put(i,map.getOrDefault(i,0)+1);
6        }
7        int ans=-1;
8        for(int i:map.keySet()){
9            if(i==map.get(i)){
10                ans= Math.max(ans,i);
11            }
12        }
13        return ans;
14    }
15}
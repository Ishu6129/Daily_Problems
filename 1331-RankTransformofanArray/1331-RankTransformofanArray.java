// Last updated: 7/12/2026, 10:41:45 AM
1class Solution {
2    public int[] arrayRankTransform(int[] arr) {
3        Set<Integer> set=new TreeSet<>();
4        for(int i:arr){
5            set.add(i);
6        }
7        int n=arr.length;
8        HashMap<Integer,Integer> map=new HashMap<>();
9        int r=1;
10        for(int i:set){
11            if(!map.containsKey(i)){
12                map.put(i,r++);
13            }
14        }
15        int[] ans=new int[n];
16        for(int i=0;i<n;i++) ans[i]=map.get(arr[i]);
17        return ans;
18    }
19}
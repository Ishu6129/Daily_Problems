// Last updated: 10/20/2026, 10:02:34 PM
1class Solution {
2    public int[] intersection(int[] nums1, int[] nums2) {
3        Set<Integer> set=new HashSet<>();
4        for(int i:nums1) set.add(i);
5        Set<Integer> aset=new HashSet<>();
6        for(int i:nums2){
7            if(set.contains(i)) aset.add(i);
8        }
9        int n=aset.size();
10        int[] ans=new int[n];
11        int idx=0;
12        for(int i:aset) ans[idx++]=i;
13        return ans;
14
15    }
16}
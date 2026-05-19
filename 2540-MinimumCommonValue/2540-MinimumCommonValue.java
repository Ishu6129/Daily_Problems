// Last updated: 5/19/2026, 12:56:02 PM
1class Solution {
2    public int getCommon(int[] nums1, int[] nums2) {
3       Set<Integer> set=new HashSet<>();
4       for(int i:nums1) set.add(i);
5       for(int i:nums2) if(set.contains(i)) return i;
6       return -1;
7
8    }
9}
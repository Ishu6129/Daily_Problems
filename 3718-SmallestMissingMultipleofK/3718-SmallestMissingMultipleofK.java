// Last updated: 8/25/2026, 4:51:06 PM
1class Solution {
2    public int missingMultiple(int[] nums, int k) {
3        Set<Integer> set=new HashSet<>();
4        for(int i:nums) set.add(i);
5        int c=1;
6        while(true){
7            if(!set.contains(c*k)) return c*k;
8            c++;
9        }
10    }
11}
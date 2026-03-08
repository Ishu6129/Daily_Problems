// Last updated: 08/03/2026, 15:21:00
1class Solution {
2    public String findDifferentBinaryString(String[] nums) {
3        Set<Integer> set=new HashSet<>();
4        for(String s:nums){
5            set.add(Integer.parseInt(s,2));
6        }
7        for(int i=0;i<nums.length;i++){
8            if(!set.contains(i)){
9                return String.format("%"+nums[0].length()+"s",Integer.toBinaryString(i)).replace(' ', '0');
10            }
11        }
12        return String.format("%"+nums[0].length()+"s",Integer.toBinaryString(nums.length)).replace(' ', '0');
13    }
14}
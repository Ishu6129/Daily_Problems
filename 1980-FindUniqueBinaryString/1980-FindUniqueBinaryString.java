// Last updated: 08/03/2026, 15:34:11
1class Solution {
2    public String findDifferentBinaryString(String[] nums) {
3        Set<Integer> set=new HashSet<>();
4        for(String s:nums){
5            set.add(Integer.parseInt(s,2));
6        }
7        for(int i=0;i<=nums.length;i++){
8            if(!set.contains(i)){
9                return String.format("%"+nums[0].length()+"s",
10                                    Integer.toBinaryString(i))
11                                    .replace(' ', '0');
12            }
13        }
14        return "";
15    }
16}
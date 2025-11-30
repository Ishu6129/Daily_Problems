// Last updated: 30/11/2025, 16:48:07
1class Solution {
2    public int maxDistinct(String s) {
3        Set<Character> set=new HashSet<>();
4        for(char i:s.toCharArray()){
5            if(!set.contains(i)){
6                set.add(i);
7            }
8        }
9        return set.size();
10    }
11}
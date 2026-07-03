// Last updated: 7/3/2026, 7:06:33 PM
1class Solution {
2    public boolean hasAllCodes(String s, int k) {
3        HashSet<String> set = new HashSet<>();
4        for (int i=0;i+k<=s.length();i++)
5            set.add(s.substring(i,i+k));
6        return set.size()==(1<<k);
7    }
8}
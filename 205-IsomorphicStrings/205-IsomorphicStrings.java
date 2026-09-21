// Last updated: 9/21/2026, 2:50:32 PM
1class Solution {
2    public boolean isIsomorphic(String s, String t) {
3        int n=s.length();
4        Set<Character> set=new HashSet<>();
5        Map<Character,Character> map=new HashMap<>();
6        for(int i=0;i<n;i++){
7            char chs=s.charAt(i);
8            char cht=t.charAt(i);
9            if(map.containsKey(chs) && map.get(chs)!=cht) return false;
10            if(!map.containsKey(chs) && set.contains(cht)) return false;
11            set.add(cht);
12            map.put(chs,cht);
13        }
14        return true;
15    }
16}
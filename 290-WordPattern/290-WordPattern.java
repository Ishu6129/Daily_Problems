// Last updated: 9/25/2026, 6:27:05 PM
1class Solution {
2    public boolean wordPattern(String pattern, String s) {
3        String[] s_arr=s.split(" ");
4        int n=pattern.length();
5        if(s_arr.length!=n) return false;
6        Map<Character,String> map=new HashMap<>();
7        Map<String,Character> map2=new HashMap<>();
8        int idx=0;
9        for(char ch:pattern.toCharArray()){
10            if(map.containsKey(ch) && !map.get(ch).equals(s_arr[idx]) || 
11               map2.containsKey(s_arr[idx]) && !map2.get(s_arr[idx]).equals(ch)) {
12                return false;}
13            map.put(ch,s_arr[idx]);
14            map2.put(s_arr[idx++],ch);
15        }
16        return true;
17    }
18}
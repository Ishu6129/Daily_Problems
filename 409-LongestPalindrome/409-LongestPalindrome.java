// Last updated: 10/17/2026, 12:34:52 PM
1class Solution {
2    int n;
3    String s;
4    public int longestPalindrome(String s) {
5        int ans=0;
6        this.n=s.length();
7        HashMap<Character,Integer> map=new HashMap<>();
8        for(char ch:s.toCharArray()){
9            map.putIfAbsent(ch,0);
10            map.put(ch,map.get(ch)+1);
11        }
12       boolean flag=false;
13       for(char ch:map.keySet()){
14        int val=map.get(ch);
15        if(val%2!=0) flag=true;
16        ans+=(val%2==0?val:val-1);
17       }
18        return flag?ans+1:ans;
19    }
20
21}
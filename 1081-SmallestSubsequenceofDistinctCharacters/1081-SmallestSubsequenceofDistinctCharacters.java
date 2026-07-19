// Last updated: 7/19/2026, 7:49:20 PM
1class Solution {
2    public String smallestSubsequence(String s) {
3         int n = s.length();
4         int[] last=new int[26];
5         int idx=0;
6         for(char ch:s.toCharArray()){
7            last[ch-'a']=idx++;
8         }
9         
10        Stack<Integer> st = new Stack<>();
11        HashSet<Character> hset = new HashSet<>();
12        for(int i=0; i<n; i++) {
13            char ch = s.charAt(i);
14            if(hset.contains(ch)) continue;
15            while(!st.isEmpty()) {
16                char prev = s.charAt(st.peek());
17                if(prev > ch && last[prev-'a']>i) {
18                    st.pop();
19                    hset.remove(prev);
20                } else break;
21            }
22
23            st.push(i);
24            hset.add(ch);
25        }
26        StringBuilder sb = new StringBuilder();
27        while(!st.isEmpty()) {
28            sb.append(s.charAt(st.pop()));
29        }
30        sb.reverse();
31        return sb.toString();
32    }
33}
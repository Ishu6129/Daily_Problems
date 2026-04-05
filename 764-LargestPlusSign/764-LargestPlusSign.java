// Last updated: 05/04/2026, 23:37:27
1class Solution {
2    public String convert(String s, int n) {
3        List<StringBuilder> ls=new ArrayList<>();
4        for(int i=0;i<n;i++){
5            ls.add(new StringBuilder(""));
6        }
7        int idx=0;
8        while(idx<s.length()){
9            for(int i=0;i<n && idx<s.length();i++){
10                ls.set(i,ls.get(i).append(s.charAt(idx++)));
11            }
12            for(int i=n-2;i>0 && idx<s.length();i--){
13                ls.set(i,ls.get(i).append(s.charAt(idx++)));
14            }
15        }
16        StringBuilder res=new StringBuilder("");
17        for(int i=0;i<n;i++){
18            res.append(ls.get(i));
19        }
20        return res.toString();
21    }
22}
// Last updated: 14/03/2026, 23:42:12
1class Solution {
2    List<String> ans;
3    Set<Character> set=Set.of('a','b','c');
4    public String getHappyString(int n, int k) {
5        ans=new ArrayList<>();
6        generate(n,"");
7        if(k>ans.size()) return "";
8        Collections.sort(ans);
9        return ans.get(k-1);
10    }
11    public void generate(int n,String s){
12        if(n==0){
13            ans.add(s);
14            return;
15        }
16        for(char i:set){
17            if(s.length()!=0 && s.charAt(s.length()-1)==i)continue;
18            generate(n-1,s+i);
19        }
20    }
21}
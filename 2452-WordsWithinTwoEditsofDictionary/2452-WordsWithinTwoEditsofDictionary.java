// Last updated: 4/22/2026, 11:27:47 AM
1class Solution {
2    public List<String> twoEditWords(String[] queries, String[] dictionary) {
3        List<String> ans=new ArrayList<>();
4        int len=queries[0].length();
5        for(String s:queries){
6            for(String ds:dictionary){
7                int c=0;
8                for(int i=0;i<len;i++){
9                    if(s.charAt(i)==ds.charAt(i)) c++;
10                }
11                if(c>=len-2){
12                    ans.add(s);
13                    break;
14                }
15            }
16        }
17        return ans;
18    }
19}
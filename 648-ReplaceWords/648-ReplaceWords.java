// Last updated: 05/02/2026, 11:43:14
1class Solution {
2    public String replaceWords(List<String> dictionary, String sentence) {
3        Set<String> set=new HashSet<>();
4        for(String s:dictionary){
5            set.add(s);
6        }
7        String[] strings=sentence.split(" ");
8        StringBuilder ans=new StringBuilder();
9        for(String s:strings){
10            StringBuilder sb=new StringBuilder();
11            boolean flag=true;
12            for(char ch:s.toCharArray()){
13                sb.append(ch);
14                String convs=sb.toString();
15                if( set.contains(convs) ){
16                    ans.append(convs).append(" ");
17                    flag=false;
18                    break;
19                }
20            }
21            if(flag) ans.append(s).append(" ");
22        }
23        return ans.toString().substring(0,ans.length()-1);
24    }
25}
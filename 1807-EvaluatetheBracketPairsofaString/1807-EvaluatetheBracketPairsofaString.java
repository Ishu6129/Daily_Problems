// Last updated: 9/26/2026, 12:44:58 PM
1class Solution {
2    public String evaluate(String s, List<List<String>> knowledge) {
3        Map<String,String> map=new HashMap<>();
4        for(List<String> ls:knowledge){
5            map.put(ls.get(0),ls.get(1));
6        }
7        int n=s.length();
8        StringBuilder sb=new StringBuilder();
9        for(int i=0;i<n;i++){
10            char ch=s.charAt(i);
11            if(ch=='('){
12                StringBuilder str=new StringBuilder();
13                i++;
14                ch=s.charAt(i);
15                while(ch!=')'){
16                    str.append(ch);
17                    ch=s.charAt(++i);
18                }
19                sb.append(map.containsKey(str.toString())?map.get(str.toString()):'?');
20            }
21            else sb.append(ch);
22        }
23        return sb.toString();
24    }
25}
// Last updated: 10/3/2026, 1:40:47 PM
1class Solution {
2    List<String> ans;
3    int n;
4    String s;
5    public List<String> removeInvalidParentheses(String s) {
6        this.n=s.length();
7        this.s=s;
8        ans=new ArrayList<>();
9        find(0,0,0,"");
10        if(ans.size()<2) return ans;
11        Collections.sort(ans,(a,b)->b.length()-a.length());
12        int mx=ans.get(0).length();
13        Set<String> set=new HashSet<>();
14        List<String> fans=new ArrayList<>();
15        for(String str:ans){
16            if(str.length()==mx){
17                if(!set.contains(str)){
18                    fans.add(str);
19                    set.add(str);
20                }
21            }
22            else break;
23        }
24        return fans;
25    }
26    public void find(int idx,int open,int close,String str){
27        if(open==close && idx==n){
28            ans.add(str);
29            return;
30        }
31        if(idx>=n || close>open) return;
32        char ch=s.charAt(idx);
33        if(ch=='('){
34            find(idx+1,open+1,close,str+'(');
35            find(idx+1,open,close,str);
36        }
37        else if(ch==')'){
38            find(idx+1,open,close+1,str+')');
39            find(idx+1,open,close,str);
40        }
41        else find(idx+1,open,close,str+ch);
42    }
43}
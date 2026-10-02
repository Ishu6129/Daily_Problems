// Last updated: 10/2/2026, 4:57:08 PM
1class Solution {
2    int n;
3    List<String> ans;
4    public List<String> generateParenthesis(int n) {
5        this.n=n;
6        ans=new ArrayList<>();
7        find(0,0,"");
8        return ans;
9    }
10    public void find(int open,int close,String str){
11        if(open==close && open==n){
12            ans.add(str);
13            return;
14        }
15
16        if(open>n || close>open) return;
17        find(open+1,close,str+'(');
18        find(open,close+1,str+')');
19    }
20}
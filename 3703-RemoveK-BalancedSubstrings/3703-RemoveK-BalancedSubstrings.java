// Last updated: 30/12/2025, 00:49:37
1class Solution{
2    class Pair{
3        char ch;
4        int freq;
5        Pair(char ch,int freq){
6            this.ch=ch;
7            this.freq=freq;
8        }
9    }
10    public String removeSubstring(String s,int k){
11        ArrayList<Pair> st=new ArrayList<>();
12        StringBuilder sb=new StringBuilder();
13        for(char ch:s.toCharArray()){
14            sb.append(ch);
15            if(st.size()==0){
16                st.add(new Pair(ch,1));
17            }
18            else{
19                Pair pre=st.get(st.size()-1);
20                if(pre.ch==ch){
21                    st.add(new Pair(ch,pre.freq+1));
22                }
23                else{
24                    st.add(new Pair(ch,1));
25                }
26            }
27            int n=st.size();
28            if(st.size()>=2*k && st.get(n-k-1).ch=='(' && st.get(n-1).ch==')' && st.get(n-k-1).freq>=st.get(n-1).freq && st.get(n-1).freq==k ){
29                int t=2*k;
30                while(t-->0){
31                    st.remove(st.size()-1);
32                    sb.deleteCharAt(sb.length()-1);
33                }
34            }
35        }
36        return sb.toString();
37    }
38}
39
// Last updated: 04/02/2026, 12:03:21
1class Trie {
2    Trie[] n;
3    boolean end;
4    public Trie() {
5            this.n=new Trie[26];
6            this.end=false;
7    }
8    
9    public void insert(String s) {
10        Trie rt=this;
11        for(char ch:s.toCharArray()){
12            if(rt.n[ch-'a']==null){
13                rt.n[ch-'a']=new Trie();
14            }
15            rt=rt.n[ch-'a'];
16        }
17        rt.end=true;
18    }
19    
20    public boolean search(String s) {
21        Trie rt=this;
22        for(char ch:s.toCharArray()){
23            if(rt.n[ch-'a']==null){
24                return false;
25            }
26            rt=rt.n[ch-'a'];
27        }
28        return rt.end;
29    }
30    
31    public boolean startsWith(String s) {
32        Trie rt=this;
33        for(char ch:s.toCharArray()){
34            if(rt.n[ch-'a']==null){
35                return false;
36            }
37            rt=rt.n[ch-'a'];
38        }
39        return true;
40    }
41}
42
43/**
44 * Your Trie object will be instantiated and called as such:
45 * Trie obj = new Trie();
46 * obj.insert(word);
47 * boolean param_2 = obj.search(word);
48 * boolean param_3 = obj.startsWith(prefix);
49 */
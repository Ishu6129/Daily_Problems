// Last updated: 07/01/2026, 01:21:49
1class tri{
2    tri[] children;
3    boolean isEnd;
4    tri(){
5        isEnd=false;
6        children=new tri[26];
7    }
8}
9class Trie {
10    tri root;
11    public Trie() {
12        root=new tri();
13    }
14    
15    public void insert(String word) {
16        tri curr=root;
17        for(char c:word.toCharArray()){
18            if(curr.children[c-'a']==null){
19                curr.children[c-'a']=new tri();
20            }
21            curr=curr.children[c-'a'];
22        }
23        curr.isEnd=true;
24    }
25    
26    public boolean search(String word) {
27        tri curr=root;
28        for(char c:word.toCharArray()){
29            if(curr.children[c-'a']==null){
30                return false;
31            }
32            curr=curr.children[c-'a'];
33        }
34        return curr.isEnd;
35    }
36    
37    public boolean startsWith(String prefix) {
38        tri curr=root;
39        for(char c:prefix.toCharArray()){
40            if(curr.children[c-'a']==null){
41                return false;
42            }
43            curr=curr.children[c-'a'];
44        }
45        return true;
46    }
47}
48
49/**
50 * Your Trie object will be instantiated and called as such:
51 * Trie obj = new Trie();
52 * obj.insert(word);
53 * boolean param_2 = obj.search(word);
54 * boolean param_3 = obj.startsWith(prefix);
55 */
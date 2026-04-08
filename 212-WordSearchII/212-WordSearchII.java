// Last updated: 08/04/2026, 13:32:39
1class Solution {
2    class Trie{
3        Trie[] n;
4        String str;
5        public Trie() {
6                this.n=new Trie[26];
7                this.str=null;
8        }
9        public void insert(String s) {
10            Trie rt=this;
11            for(char ch:s.toCharArray()){
12                if(rt.n[ch-'a']==null){
13                    rt.n[ch-'a']=new Trie();
14                }
15                rt=rt.n[ch-'a'];
16            }
17            rt.str=s;
18
19        }
20    }
21    public List<String> findWords(char[][] board, String[] words) {
22        Trie root=new Trie();
23        for(String s:words){
24            root.insert(s);
25        }
26        List<String> res=new ArrayList<>();
27        int m=board.length;
28        int n=board[0].length;
29        for(int i=0;i<m;i++){
30            for(int j=0;j<n;j++){
31                find(board,i,j,root,res);
32            }
33        }
34        return res;
35    }
36    public void find(char[][] board,int i,int j,Trie root,List<String> res){
37        if(i<0||j<0||i>=board.length||j>=board[0].length) return;
38
39        char ch=board[i][j];
40        if(ch=='#' || root.n[ch-'a']==null) return;
41
42        root=root.n[ch-'a'];
43        if(root.str!=null){
44            res.add(root.str);
45            root.str=null;
46        }
47
48        board[i][j]='#';
49        find(board,i,j-1,root,res);
50        find(board,i-1,j,root,res);
51        find(board,i,j+1,root,res);
52        find(board,i+1,j,root,res);
53        board[i][j]=ch;
54    }
55}
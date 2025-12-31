// Last updated: 31/12/2025, 12:27:10
1class Solution {
2    class TrieNode {
3        TrieNode[] children;
4        boolean isEndOfWord;
5
6        TrieNode() {
7            children = new TrieNode[26];
8            isEndOfWord = false;
9        }
10    }
11    TrieNode root = new TrieNode();
12    public void insert(String word) {
13        TrieNode current = root;
14
15        for (int i = 0; i < word.length(); i++) {
16            int index = word.charAt(i) - 'a';
17
18            if (current.children[index] == null) {
19                current.children[index] = new TrieNode();
20            }
21            current = current.children[index];
22        }
23        current.isEndOfWord = true;
24    }
25    public String check(String word) {
26        TrieNode current = root;
27        StringBuilder sb=new StringBuilder();
28        for (int i=0;i<word.length(); i++) {
29            int index=word.charAt(i) - 'a';
30            if (current.children[index] == null) {
31                return sb.toString();
32            }
33            else{
34                sb.append(word.charAt(i));
35            }
36            current=current.children[index];
37        }
38        return sb.toString();
39    }
40     public String longestCommonPrefix(String[] strs) {
41        if(strs.length==0) return "";
42        insert(strs[0]);
43        String ans=strs[0];
44        for(int i=1;i<strs.length;i++){
45            String match=check(strs[i]);
46            if(match.length()<ans.length()){
47                ans=match;
48            }
49            if(ans.length()==0) return ""; 
50        }
51        return ans;
52
53    }
54}
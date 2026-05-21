// Last updated: 5/21/2026, 1:42:13 PM
1class Node{
2    Node[] child;
3    boolean end;
4    Node(){
5        child=new Node[10];
6        end=false;
7    }
8}
9class Solution {
10    private Node root;
11    public void Trie(){
12        root=new Node();
13    }
14    public void add(String str){
15        Node curr=root;
16        for(char ch:str.toCharArray()){
17            if(curr.child[ch-'0']==null){
18                curr.child[ch-'0']=new Node();
19            }
20            curr=curr.child[ch-'0'];
21        }
22        curr.end=true;
23    }
24    public int PreMatch(String str){
25        Node curr=root;
26        int c=0;
27        for(char ch:str.toCharArray()){
28            if(curr.child[ch-'0']==null){
29                return c;
30            }
31            curr=curr.child[ch-'0'];
32            c++;
33        }
34        return c;
35    }
36
37    public int longestCommonPrefix(int[] arr1, int[] arr2) {
38        Trie();
39        for(int i:arr1){
40            add(i+"");
41        }
42        int ans=0;
43        for(int i:arr2){
44            ans=Math.max(ans,PreMatch(i+""));
45        }
46        return ans;
47    }
48}
// Last updated: 06/01/2026, 13:12:47
1class LRUCache {
2    class Node{
3        Node next,prev;
4        int key,val;
5        Node(int key,int val){
6            this.key=key;
7            this.val=val;
8            prev=null;
9            next=null;
10        }
11    }
12    Node head=new Node(-1,-1);
13    Node tail=new Node(-1,-1);
14    HashMap<Integer,Node> map=new HashMap<>();
15    int limit;
16
17    public void addNode(Node newNode){
18        Node oldNode=head.next;
19        head.next=newNode;
20        newNode.prev=head;
21        oldNode.prev=newNode;
22        newNode.next = oldNode;
23    }
24
25    public void deleteNode(Node oldNode){
26        Node oldPrev=oldNode.prev;
27        Node oldNext=oldNode.next;
28        oldPrev.next=oldNext;
29        oldNext.prev=oldPrev;
30    }
31
32    public LRUCache(int capacity) {
33        limit=capacity;
34        head.next=tail;
35        tail.prev=head;
36    }
37    
38    public int get(int key) {
39        if(!map.containsKey(key)) return -1;
40        int ans=map.get(key).val;
41        Node ansNode=map.get(key);
42        map.remove(key);
43        deleteNode(ansNode);
44        put(key,ans);
45        return ans;
46    }
47    
48    public void put(int key, int value) {
49        if(map.containsKey(key)){
50            Node oldNode=map.get(key);
51            deleteNode(oldNode);
52            map.remove(key);
53        }
54        if(map.size()==limit){
55            map.remove(tail.prev.key);
56            deleteNode(tail.prev);
57        }
58        Node newNode = new Node(key,value);
59        addNode(newNode);
60        map.put(key,newNode);
61    }
62}
63
64/**
65 * Your LRUCache object will be instantiated and called as such:
66 * LRUCache obj = new LRUCache(capacity);
67 * int param_1 = obj.get(key);
68 * obj.put(key,value);
69 */
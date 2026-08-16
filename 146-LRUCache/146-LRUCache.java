// Last updated: 8/16/2026, 3:34:25 PM
1class Node{
2    int key;
3    int val;
4    Node next,pre;
5    Node(int key,int val){
6        this.key=key;
7        this.val=val;
8        this.pre=null;
9        this.next=null;
10    }
11}
12class LRUCache {
13    int limit;
14    Node head=new Node(-1,-1);
15    Node tail=new Node(-1,-1);
16    Map<Integer,Node> map=new HashMap<>();
17    public LRUCache(int capacity) {
18        limit=capacity;
19        head.next=tail;
20        tail.pre=head;
21    }
22    public void delete(Node nn){
23        Node oldpre=nn.pre;
24        Node oldnext=nn.next;
25        oldpre.next=oldnext;
26        oldnext.pre=oldpre;
27    } 
28    public int get(int key) {
29        if(!map.containsKey(key)) return -1;
30        Node nn=map.get(key);
31        int ans=nn.val;
32        map.remove(key);
33        delete(nn);
34        map.put(key,nn);
35        Node prehn=head.next;
36        head.next=nn;
37        nn.pre=head;
38        nn.next=prehn;
39        prehn.pre=nn;
40        return ans;
41    }
42    
43    public void put(int key, int value) {
44        if(map.containsKey(key)){
45            Node nn=map.get(key);
46            nn.val=value;
47            map.remove(key);
48            delete(nn);
49        }
50        if(map.size()==limit){
51            Node last=tail.pre;
52            map.remove(last.key);
53            delete(last);
54        }
55        Node nn=new Node(key,value);
56        Node prehn=head.next;
57        head.next=nn;
58        nn.pre=head;
59        nn.next=prehn;
60        prehn.pre=nn;
61        map.put(key,nn);
62    }
63}
64
65/**
66 * Your LRUCache object will be instantiated and called as such:
67 * LRUCache obj = new LRUCache(capacity);
68 * int param_1 = obj.get(key);
69 * obj.put(key,value);
70 */
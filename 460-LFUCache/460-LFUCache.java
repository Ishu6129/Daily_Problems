// Last updated: 8/16/2026, 5:27:11 PM
1class Node{
2    int key,val,freq;
3    Node next,pre;
4    Node(int key,int val,int freq){
5        this.key=key;
6        this.val=val;
7        this.freq=freq;
8        this.pre=null;
9        this.next=null;
10    }
11}
12class LFUCache {
13    int limit;
14    Node head=new Node(-1,-1,-1);
15    Node tail=new Node(-1,-1,-1);
16    Map<Integer,Node> map=new HashMap<>();
17    PriorityQueue<Integer> pq = new PriorityQueue<>();
18    public LFUCache(int capacity) {
19        limit=capacity;
20        head.next=tail;
21        tail.pre=head;
22    }
23    public void delete(Node nn){
24        Node oldpre=nn.pre;
25        Node oldnext=nn.next;
26        oldpre.next=oldnext;
27        oldnext.pre=oldpre;
28    }
29    public int get(int key) {
30        if(!map.containsKey(key)) return -1;
31        Node nn=map.get(key);
32        int ans=nn.val;
33        pq.remove(Integer.valueOf(nn.freq));
34        nn.freq++;
35        pq.add(nn.freq);
36        delete(nn);
37        Node prehn=head.next;
38        head.next=nn;
39        nn.pre=head;
40        nn.next=prehn;
41        prehn.pre=nn;
42        return ans;
43    }
44    
45    public void put(int key, int value) {
46        if(map.containsKey(key)){
47            Node nn=map.get(key);
48            nn.val=value;
49            pq.remove(Integer.valueOf(nn.freq));
50            nn.freq++;
51            pq.add(nn.freq);
52            delete(nn);
53            Node prehn=head.next;
54            head.next=nn;
55            nn.pre=head;
56            nn.next=prehn;
57            prehn.pre=nn;
58            return;
59        }
60        if(map.size()==limit){
61            dLFRU();
62        }
63        Node nn=new Node(key,value,1);
64        Node prehn=head.next;
65        head.next=nn;
66        nn.pre=head;
67        nn.next=prehn;
68        prehn.pre=nn;
69        map.put(key,nn);
70        pq.add(1);
71    }
72    public void dLFRU(){
73        int rmfreq=pq.peek();
74        Node dummy=tail.pre;
75        while(dummy!=head){
76            if(dummy.freq==rmfreq){
77                pq.poll();
78                map.remove(dummy.key);
79                delete(dummy);
80                break;
81            }
82            dummy=dummy.pre;
83        }
84    }
85}
86
87/**
88 * Your LFUCache object will be instantiated and called as such:
89 * LFUCache obj = new LFUCache(capacity);
90 * int param_1 = obj.get(key);
91 * obj.put(key,value);
92 */
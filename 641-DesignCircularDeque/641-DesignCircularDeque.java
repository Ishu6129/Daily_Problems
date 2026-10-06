// Last updated: 10/6/2026, 9:25:38 PM
1class Node{
2    int val;
3    Node next,pre;
4    Node(int val){
5        this.val=val;
6        this.pre=null;
7        this.next=null;
8    }
9}
10class MyCircularDeque {
11    Node head;
12    Node tail;
13    int size;
14    int capacity;
15    public MyCircularDeque(int k) {
16        this.head=new Node(-1);
17        this.tail=new Node(-1);
18        head.next=tail;
19        tail.pre=head;
20        this.size=0;
21        this.capacity=k;
22    }
23    
24    public boolean insertFront(int value) {
25        if(size==capacity) return false;
26        Node nn=new Node(value);
27        Node old=head.next;
28        nn.next=old;
29        nn.pre=head;
30        head.next=nn;
31        old.pre=nn;
32        size++;
33        return true;
34    }
35    
36    public boolean insertLast(int value) {
37        if(size==capacity) return false;
38        Node nn=new Node(value);
39        Node old=tail.pre;
40        nn.next=tail;
41        nn.pre=old;
42        old.next=nn;
43        tail.pre=nn;
44        size++;
45        return true;
46    }
47    
48    public boolean deleteFront() {
49        if(size==0) return false;
50        Node old=head.next;
51        head.next=old.next;
52        old.next.pre=head;
53        size--;
54        return true;
55    }
56    
57    public boolean deleteLast() {
58        if(size==0) return false;
59        Node old = tail.pre;
60        tail.pre=old.pre;
61        old.pre.next=tail;
62        size--;
63        return true;
64    }
65    
66    public int getFront() {
67        if(size==0) return -1;
68        return head.next.val;
69    }
70    
71    public int getRear() {
72        if(size==0) return -1;
73        return tail.pre.val;
74    }
75    
76    public boolean isEmpty() {
77        return size==0;
78    }
79    
80    public boolean isFull() {
81        return size==capacity;
82    }
83}
84
85/**
86 * Your MyCircularDeque object will be instantiated and called as such:
87 * MyCircularDeque obj = new MyCircularDeque(k);
88 * boolean param_1 = obj.insertFront(value);
89 * boolean param_2 = obj.insertLast(value);
90 * boolean param_3 = obj.deleteFront();
91 * boolean param_4 = obj.deleteLast();
92 * int param_5 = obj.getFront();
93 * int param_6 = obj.getRear();
94 * boolean param_7 = obj.isEmpty();
95 * boolean param_8 = obj.isFull();
96 */
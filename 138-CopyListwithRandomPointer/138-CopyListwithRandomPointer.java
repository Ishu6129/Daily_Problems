// Last updated: 9/2/2026, 10:28:03 PM
1/*
2// Definition for a Node.
3class Node {
4    int val;
5    Node next;
6    Node random;
7
8    public Node(int val) {
9        this.val = val;
10        this.next = null;
11        this.random = null;
12    }
13}
14*/
15
16class Solution {
17    public Node copyRandomList(Node head) {
18        if(head==null) return null;
19        Map<Node,Node> map=new HashMap<>();
20        Node curr=head;
21        while(curr!=null){
22            map.put(curr,new Node(curr.val));
23            curr=curr.next;
24        }
25        curr=head;
26        while(curr!=null){
27            map.get(curr).next=map.get(curr.next);
28            map.get(curr).random=map.get(curr.random);
29            curr=curr.next;
30        }
31        return map.get(head);
32    }
33}
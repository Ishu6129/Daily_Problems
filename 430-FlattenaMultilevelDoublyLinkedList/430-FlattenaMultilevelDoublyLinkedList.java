// Last updated: 03/11/2025, 16:24:33
class Solution {
    Node temp;
    public Node flatten(Node head) {
        if (head == null) return null;
        Node ans = new Node();
        temp = ans;
        move(head);
        ans.next.prev = null;
        return ans.next;
    }
    public void move(Node head){
        if (head == null) return;
        
        temp.next = head;
        head.prev = temp;
        temp = head;
        
        Node next = head.next;
        
        if(head.child != null){
            move(head.child);
            head.child = null;
        }
        
        move(next);
    }
}

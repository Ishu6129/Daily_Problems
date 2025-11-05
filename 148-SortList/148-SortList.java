// Last updated: 05/11/2025, 22:36:13
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode sortList(ListNode head) {
        ListNode dummy=head;
        ArrayList<Integer> arr=new ArrayList<>();
        while(dummy!=null){
            arr.add(dummy.val);
            dummy=dummy.next;
        }
        Collections.sort(arr);
        dummy=head;
        int idx=0;
        while(dummy!=null){
            dummy.val=arr.get(idx);
            idx++;
            dummy=dummy.next;
        }
        return head;
    }
}
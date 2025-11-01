// Last updated: 01/11/2025, 15:27:37
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
    public ListNode modifiedList(int[] nums, ListNode head) {
        Set<Integer> set=new HashSet<>();
        for(int i:nums){
            set.add(i);
        }
        ListNode dummy=new ListNode(0,head);
        ListNode pointer=dummy;
        while(pointer.next!=null){
            if(set.contains(pointer.next.val)){
                pointer.next=pointer.next.next;
            }
            else{
                pointer=pointer.next;
            }
        }
        return dummy.next;
    }

}
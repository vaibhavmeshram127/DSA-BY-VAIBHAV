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
    public ListNode swapPairs(ListNode head) {
        
        if(head==null || head.next==null){
            return head;
        }
        ListNode Dummy=new ListNode(0);
        Dummy.next=head;
        ListNode prev=Dummy;
        while(prev.next!=null && prev.next.next!=null){
            ListNode current=prev.next;
            ListNode next=current.next;
            current.next=next.next;
            next.next=current;
            prev.next=next;
            prev=current;

        }

        return Dummy.next;
    }
}
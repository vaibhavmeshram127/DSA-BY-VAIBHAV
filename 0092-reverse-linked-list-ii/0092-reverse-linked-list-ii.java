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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head==null || head.next==null){
            return head;
        }
        
        ListNode Dummy=new ListNode(0);
        Dummy.next=head;
        ListNode prev=Dummy;
        for(int i=1;i<left;i++){
            prev=prev.next;

        }
        ListNode start=prev.next;
        ListNode current=start.next;
        

        for(int i=left;i<right;i++){
            ListNode next=current.next;
            current.next=prev.next;
            prev.next=current;
            current=next;
        }
        start.next=current;
        return Dummy.next;

        
    }
}
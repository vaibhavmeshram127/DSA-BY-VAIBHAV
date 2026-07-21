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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int len=0;
        
        ListNode size=head;
        while(size!=null){
            size=size.next;
            len++;

        }
        if(len==1){
            return null;
        }
        ListNode dummy=new ListNode(0);
        ListNode prev=dummy;
        prev.next=head;
        ListNode curr=head;
        for(int i=0;i<len-n;i++){
            curr=curr.next;
            prev=prev.next;
        }
        prev.next=curr.next;
        return dummy.next;
        
    }
}
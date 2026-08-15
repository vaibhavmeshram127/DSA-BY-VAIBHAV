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
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null){
            return null;
        }
        ListNode current=head;
        ListNode next=current.next;
        while(current!=null && next!=null){
            if(current.val!=next.val){
                current.next=next;
                current=current.next;
            }
            else{
                next=next.next;
            }
        }
        current.next=null;
        return head;
       
        

        
    }
}
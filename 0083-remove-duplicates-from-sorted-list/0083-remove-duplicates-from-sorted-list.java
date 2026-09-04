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
        ListNode temp=new ListNode(0);
        ListNode t1=temp;
        t1.next=head;
        ListNode h1=head;
        while(h1!=null && h1.next!=null){
            if(h1.val==h1.next.val){
                h1=h1.next;
                t1.next=h1;
            }
            else{
                h1=h1.next;
                t1=t1.next;
            }
        }
        return temp.next;
        
    }
}
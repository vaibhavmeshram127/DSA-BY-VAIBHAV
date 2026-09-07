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
    public ListNode rotateRight(ListNode head, int k) {
        
        ListNode curr=head;
        int size=0;
        while(curr!=null){
            curr=curr.next;
            size=size+1;
        }
        if(head==null){
            return null;
        }
        
        
        
        if(k>size){
            k=k%size;
        }

        if(k==size || k==0 || head.next==null){
            return head;
        }
        ListNode last=head;
        while(last.next!=null){
            last=last.next;
        }
        ListNode reff=head;
        for(int i=1;i<size-k;i++){
            reff=reff.next;

        }
        ListNode h1=reff.next;
        reff.next=null;
        last.next=head;
        return h1;

    

        
        
    }
}
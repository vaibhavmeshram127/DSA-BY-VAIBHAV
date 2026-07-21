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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode h1=l1;
        ListNode h2=l2;
        ListNode dummy=new ListNode(0);
        ListNode h3=dummy;
        int carry=0;
        while(h1!=null  || h2!=null || carry!=0){
            int sum=0;
            if(h1!=null){
                sum=sum+h1.val;
                h1=h1.next;

            }
            if(h2!=null){
                sum=sum+h2.val;
                h2=h2.next;
            }
            if(carry!=0){
                sum=sum+carry;
            }
            carry=sum/10;
            
            ListNode current=new ListNode(sum%10);
            h3.next=current;
            h3=h3.next;
        }
        return dummy.next;

        
    }
}
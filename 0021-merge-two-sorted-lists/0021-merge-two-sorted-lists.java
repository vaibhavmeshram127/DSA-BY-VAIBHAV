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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode h3=new ListNode(0);
        ListNode temp=h3;
        ListNode h1=list1;
        ListNode h2=list2;
        

        while(h1!=null &&  h2!=null){
            if(h1.val<=h2.val){
                temp.next=h1;
                temp=temp.next;
                h1=h1.next;
            }else{
                temp.next=h2;
                temp=temp.next;
                h2=h2.next;
            }

        }
        while(h1!=null){
            temp.next=h1;
            temp=temp.next;
            h1=h1.next;
        }
        while(h2!=null){
            temp.next=h2;
            temp=temp.next;
            h2=h2.next;
        }
        return h3.next;
        
    }
}
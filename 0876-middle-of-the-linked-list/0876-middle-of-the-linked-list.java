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
    public ListNode middleNode(ListNode head) {
        if(head==null){
            return null;
        }
        ListNode count=head;
        int len=0;
        while(count!=null){
            count=count.next;
            len++;
        }
        int mid=len/2;
        ListNode ans=head;
        for(int i=0;i<mid;i++){
            ans=ans.next;

        }
        return ans;

        
    }
}
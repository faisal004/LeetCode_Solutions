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
        if(head==null || head.next==null ){
            return head;
        }
        ListNode dummy= new ListNode(0);
        ListNode prev=dummy;
        ListNode curr=head;

        while(curr!=null && curr.next!=null){
            ListNode savedPair=curr.next.next;
            ListNode temp=curr.next;

            //reverse
            temp.next=curr;
            curr.next=savedPair;
            prev.next=temp;
            //update pointer
            prev=curr;
            curr=savedPair;


        }
        return dummy.next;

    }
}
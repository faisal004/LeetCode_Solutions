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
         if (head == null || head.next == null || left == right) {
            return head;
        }
        ListNode dummy= new ListNode(-1);
        dummy.next=head;
        ListNode previous=dummy;
        ListNode current=head;
     
    
//reaching the left node
         for(int i=0;i<left-1;i++){
             previous=current;
             current=current.next; 

         }
        ListNode prev=null;
        ListNode temp=null;
         for(int i=0;i<right-left+1;i++){
             temp=current.next;
             current.next=prev;
             prev=current;
             current=temp;

         }
         previous.next.next=current;
         previous.next=prev;

       return dummy.next; 
    }
}
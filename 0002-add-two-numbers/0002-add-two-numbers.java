
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy= new ListNode(0);
        ListNode curr=dummy;
        int carry=0;
        while(l1!=null||l2!=null || carry!=0)    {
            int v1;
            int v2;
            if(l1!=null){
                v1=l1.val;
            }else{
                 v1=0;
            }
             if(l2!=null){
                 v2=l2.val;
            }else{
                 v2=0;
            }


            int value=v1+v2+carry;
            carry=value/10;
            value=value%10;
            curr.next= new ListNode(value);

            curr=curr.next;
            if(l1!=null){
                l1=l1.next;
            }
             if(l2!=null){
                l2=l2.next;
            }
        }
        return dummy.next;
    }
}
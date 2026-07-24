class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy=new ListNode(0);
        dummy.next=null;
        ListNode curr = dummy;
        ListNode tempa = l1;
        ListNode tempb = l2;
        int carry=0;
        while(tempa!=null || tempb!=null || carry!=0){
            int val1=(tempa!=null)? tempa.val:0;
            int val2=(tempb!=null)? tempb.val:0;

            int sum=val1+val2+carry;
            carry=sum/10;
            int digit=sum%10;
            curr.next=new ListNode(digit);
            curr=curr.next;

            if(tempa!=null)
              tempa=tempa.next;
            
            if(tempb!=null)
              tempb=tempb.next;  
              
        }
        return dummy.next;
    }
}
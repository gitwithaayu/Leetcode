class Solution {
    public ListNode deleteMiddle(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        ListNode prev=null;
        ListNode post=null;
        if(head==null || head.next==null){
            return null;
        }
        while(fast!=null && fast.next!=null){
            prev=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
       post=slow.next;
    
       prev.next=post;
       return head;
    }
   
}

//         if (head == null || head.next == null)
//             return null;
//         ListNode temp = head;
//         int c = 0;
//         while (temp != null) {
//             c++;
//             temp = temp.next;
//         }
//         int mid = c / 2 - 1;
//         temp = head;
//         while (mid > 0) {
//             temp = temp.next;
//             mid--;
//         }
//         temp.next = temp.next.next;
//         return head;
//     }
// }
       


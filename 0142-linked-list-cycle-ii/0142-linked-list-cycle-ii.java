/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        ListNode ans=head;
         ListNode ptr=fast;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
               ptr=fast;
               slow=head;

               while(ptr!=slow){
                 ptr=ptr.next;
                 slow=slow.next;


            }
            
            return ptr;

        }
        }
        return null;
            
    }
}
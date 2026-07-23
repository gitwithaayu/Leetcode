public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode tempa=headA;
        ListNode tempb=headB;
        while(tempa!=tempb ){
             if(tempa==null){
                tempa =headB;
                }
             else {
                tempa=tempa.next;
             }
              if(tempb==null){
                tempb =headA;
                }
             else {
                tempb=tempb.next;
             }
        
    }
    return tempa;
}
}
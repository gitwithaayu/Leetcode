class Solution {

    public ListNode sortList(ListNode head) {

        // Base case
        if (head == null || head.next == null)
            return head;

        ListNode slow = head;
        ListNode fast = head;
        ListNode temp = null;

        // Find middle
        while (fast != null && fast.next != null) {
            temp = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        // Break the list
        temp.next = null;

        // Sort both halves
        ListNode left = sortList(head);
        ListNode right = sortList(slow);

        // Merge
        return merge(left, right);
    }

    public ListNode merge(ListNode left, ListNode right) {

        ListNode ans = new ListNode(-1);
        ListNode temp = ans;

        while (left != null && right != null) {

            if (left.val <= right.val) {
                temp.next = left;
                temp = left;
                left = left.next;
            } else {
                temp.next = right;
                temp = right;
                right = right.next;
            }
        }

        while (left != null) {
            temp.next = left;
            temp = left;
            left = left.next;
        }

        while (right != null) {
            temp.next = right;
            temp = right;
            right = right.next;
        }

        return ans.next;
    }
}
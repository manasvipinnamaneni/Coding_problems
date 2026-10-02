class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode curr = head;
        ListNode prev = null;
        while (curr != null) {
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        if (n == 1) {
            prev = prev.next;
        } 
        else {
            ListNode temp = prev;
            for (int i = 1; i < n - 1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
        }
        curr = prev;
        prev = null;
        while (curr != null) {
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }
}
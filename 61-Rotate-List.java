class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) {
            return head;
        }
        
        ListNode curr = head;
        int length = 1;
        while (curr.next != null) {
            curr = curr.next;
            length++;
        }
        
        k = k % length;
        if (k == 0) {
            return head;
        }
        

        curr.next = head;

        int stepsToNewTail = length - k;
        ListNode newTail = head;
        for (int i = 1; i < stepsToNewTail; i++) {
            newTail = newTail.next;
        }
    
        ListNode newHead = newTail.next;
        newTail.next = null;
        
        return newHead;
    }
}

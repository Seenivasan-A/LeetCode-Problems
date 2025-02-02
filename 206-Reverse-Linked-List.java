
class Solution {
    public ListNode reverseList(ListNode head)
    {
        if (head == null || head.next == null) return head;
        Stack<ListNode> stack = new Stack<ListNode>();
        ListNode temp = head;
        while (temp!= null) {
            stack.push(temp);
            temp=temp.next;
        }
        ListNode last = stack.pop();
        ListNode newHead = last;
        while (!stack.empty()) {
            last.next = stack.pop();
            last =last.next;
        }
        last.next=null;
        return newHead;
    }
}
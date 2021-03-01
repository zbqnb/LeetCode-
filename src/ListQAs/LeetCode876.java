package ListQAs;

public class LeetCode876 {
    //双指针法返回链表中间节点
    public ListNode middleNode(ListNode head) {
        if (head == null) {
            return head;
        }

        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }


}

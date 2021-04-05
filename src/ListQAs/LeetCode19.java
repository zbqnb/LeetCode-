package ListQAs;

public class LeetCode19 {
    //给你一个链表，删除链表的倒数第 n 个结点，并且返回链表的头结点。
    // 思路就是找到链表第k个节点返回
    // list pre
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode pre = dummy;
        ListNode fast = head;
        ListNode slow = head;
        int count = n;
        while (count > 0) {
            fast = fast.next;
            count--;
        }
        while (fast != null) {
            pre = pre.next;
            slow = slow.next;
            fast = fast.next;
        }
        pre.next = slow.next;
        return dummy;
    }
}

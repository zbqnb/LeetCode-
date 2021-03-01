package ListQAs;

import java.util.List;

public class LeetCode148 extends ListNode{
    /**
     * 给输入链表进行排序
     * @param head
     * @return
     */
    // 1-> 6 -> 7 -> 8-> 9 -> 4 -> 3
    //[1,2,3,4,5,6]
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode middle = middleNode(head);
        ListNode rightHead = middle.next;
        middle = null;
        ListNode left = sortList(head);
        ListNode right = sortList(rightHead);
        return mergeTwoLists(left,right);
    }
    //返回列表中间通过递归不断拆分
    private ListNode middleNode(ListNode head) {
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
    // LeetCode21对两个有序链表排序
    private ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        // 递归
        // 1 -> 2 -> 3
        // 2 -> 3- > 4
        // 栈
        // l1.n -> null

        if (l1.next == null) {
            return l1;
        }
        if (l2.next == null) {
            return l2;
        }
        if(l1.val < l2.val) {
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }
    }
}

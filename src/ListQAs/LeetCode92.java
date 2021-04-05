package ListQAs;

import TreeQAs.TreeNode;

public class LeetCode92 {

    public ListNode reverseBetween(ListNode head, int left, int right) {
        // 1 2 3 4 5
        //先找到断开的节点

        ListNode dummyHead = new ListNode(-1);
        dummyHead.next = head;
        ListNode cur = dummyHead.next;
        for (int i = 0; i < left - 1 ; i++) {
            cur = cur.next;
        }
        ListNode pre = cur;
        //    pre           right
        //  1  2   3   4     5   6
        //        left
        for (int i = 0; i < right - left + 1; i++) {
            cur = cur.next;
        }
        ListNode rightNode = cur;

        ListNode leftNode = pre.next;
        ListNode curr = rightNode.next;

        pre.next = null;
        rightNode.next = null;
        reverse(leftNode);

        pre.next = rightNode;
        leftNode.next = curr;

        return dummyHead.next;
        // pre next
        // 如何新建一个子列表
    }

    private ListNode reverse(ListNode node){

        if (node == null || node.next == null) {
            return null;
        }
        ListNode cur = reverse(node.next);
        node.next.next = node;
        node.next = null;
        return cur;
    }
}

package ListQAs;

class LeetCode21 extends ListNode {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
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
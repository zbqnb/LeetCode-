package ListQAs;

//翻转链表，不会就去死吧
//傻子题又没做出来
public class LeetCode206 {
    // 1-> 2 -> 3 -> 4
    // 1 2 3 4
    public ListNode reverseList(ListNode head) {

        if (head == null || head.next == null) {
            return head;
        }
        // 4
        // 4.nest .nest = head3
        //

        ListNode p = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return p;

    }
}

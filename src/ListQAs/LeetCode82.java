package ListQAs;

public class LeetCode82 {

        public ListNode deleteDuplicates(ListNode head) {
            ListNode dummyHead = new ListNode(-1);

            dummyHead.next = head;

            ListNode cur = head.next;
            ListNode nst = head.next.next;
            while (head.next != null) {
                if (cur.val != nst.val) {
                    head.next = cur;
                    cur = cur.next;
                    nst = nst.next;
                } else {
                    cur = cur.next;
                    nst = nst.next;
                }
            }
        return dummyHead.next;
        }
}

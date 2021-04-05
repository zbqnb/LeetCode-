package ListQAs;

public class LeetCode141 {
    // 判断链表是否有环
    public boolean hasCycle(ListNode head) {
        //双指针
        //
        if (head == null || head.next == null) {
            return false;
        }
        ListNode fast = head.next;
        ListNode slow = head;

        while (slow != fast){
            if (fast == null || fast.next == null) {
                return false;
            }
           fast = fast.next.next;
           slow = slow.next;
        }
        return true;
    }
}

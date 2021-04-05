package ListQAs;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LeetCode144 extends ListNode{
    public ListNode dectectCycle(ListNode head) {
        Set<ListNode> visited = new HashSet<>();

        while (head != null){
            if (!visited.contains(head)) {
                visited.add(head);
            }else {
                return head;
            }
            head = head.next;
        }
        return null;
    }

    //上面用了set，但是题目规定的是常数项的空间，因此需要用O(1)的双指针
    public ListNode dectectCycle2(ListNode head) {

        if (head == null || head.next == null) {
            return null;
        }
        ListNode fast = head;
        ListNode slow = head;
        //找到第一次相遇的位置
        while (true){
            if (fast.next == null) {
                return null;
            }
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                fast = head;
                break;
            }
        }
        while (fast != slow) {
            fast = fast.next;
            slow = slow.next;
        }
        return fast;
    }
}

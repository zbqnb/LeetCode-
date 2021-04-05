package ListQAs;

public class Sword22 {
    //找到链表倒数第k个节点
    //链表 做到这感觉链表和array有时是一个东西
    //双指针都可以有效的扫描两种数据结构达到目的达到目的


        public ListNode getKthFromEnd(ListNode head, int k) {

            ListNode fast = head;
            ListNode slow = head;
            int count = k;
            while (count > 0) {
                fast = fast.next;
                count--;
            }

            while (fast != null) {
                slow = slow.next;
                fast = fast.next;
            }
            return  slow;

        }

}

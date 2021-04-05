package ListQAs;

public class Sword24 extends ListNode{
    //翻转链表
    //很经典的题目了，首先想到是递归栈。先进后出，这样 head 就直接放在最后了

    // 1 <- 2 <- 3
    // 1 -> 2 - > 3 -4
    class Solution {
        public ListNode reverseList(ListNode head) {

            if (head.next == null|| head == null) {
                return head;
            }
            ListNode newNode = reverseList(head.next);

            head.next.next = head; // node3 -> node2 node1 -> node2
            head.next = null;

            return newNode;
        }
    }
}

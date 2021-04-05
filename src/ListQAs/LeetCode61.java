package ListQAs;

public class LeetCode61 {
    // 怎么找到断开的位置
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0)
        {
            return head;
        }
        ListNode cursor = head;
        ListNode tail = null;
        int length = 0;
        while (cursor.next != null) {
            length++;
            cursor = cursor.next; //这样是赋值，而不是链接链表
        }
        // 找到需要走的长度？
        // 首尾拼接
        cursor.next = head;

        k %= length;
        // 当k为0时，不需要旋转，
        if (k == 0) return head;

        // 不满足上述条件，必将进行旋转，所以先将首尾相连
        cursor.next = head;

        for (int i = 0; i < length - k; i++) {
            //找到断开链表的地方
            cursor = cursor.next;
        }
        ListNode newhead = cursor.next;
        cursor.next = null;
        return  newhead;
    }
}


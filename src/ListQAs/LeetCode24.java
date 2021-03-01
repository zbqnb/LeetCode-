package ListQAs;

public class LeetCode24 extends ListNode{
    //[1->2 -> 3->4]
    //[2<-1 <- 4<-3]
    public ListNode swapPairs(ListNode head) {

      if (head == null || head.next == null) {
          return head;
      }

      ListNode nextNode = head.next;
      head.next = swapPairs(head.next.next);
      nextNode.next = head;
      return nextNode;
    }
}

// Question Link    https://leetcode.com/problems/remove-duplicates-from-sorted-list/

public class RemoveDuplicatesSortedList83 {

  public ListNode deleteDuplicates(ListNode head) {

    if (head == null || head.next == null) {
      return head;
    }

    ListNode curr = head;
    ListNode prev = null;
    while (curr != null) {
      if (prev != null && curr.val == prev.val) {
        prev.next = curr.next;
        curr = curr.next;
      } else {
        prev = curr;
        curr = curr.next;
      }
    }

    return head;
  }

  public class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
      this.val = val;
    }

    ListNode(int val, ListNode next) {
      this.val = val;
      this.next = next;
    }
  }

}

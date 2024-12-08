import java.util.Stack;

public class PalindromeLinkedList234 {
  public static void main(String[] args) {
    int[] values = { 1, 2, 2 }; // Example of a palindrome list
    ListNode head = createListFromArray(values);
    boolean result = isPalindrome(head);

    System.out.println("Is palindrome: " + result);
  }

  public static boolean isPalindrome(ListNode head) {
    Stack<Integer> st = new Stack<>();
    ListNode fast = head;

    while (fast != null && fast.next != null) {
      st.push(head.val);
      head = head.next;
      fast = fast.next.next;
    }

    if (fast != null) {
      head = head.next;
    }

    System.out.println(st.size());
    System.out.println(head.val);

    while (!st.empty()) {
      System.out.println("in while");
      if (st.pop() != head.val) {
        System.out.println("in if");
        return false;
      }
      head = head.next;
      System.out.println("before if");
    }
    return true;

  }

  public static class ListNode { // Declare ListNode as static
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

  // Helper function to create a linked list from an array
  public static ListNode createListFromArray(int[] arr) {
    if (arr.length == 0) {
      return null;
    }

    ListNode head = new ListNode(arr[0]);
    ListNode current = head;

    for (int i = 1; i < arr.length; i++) {
      current.next = new ListNode(arr[i]);
      current = current.next;
    }

    return head;
  }
}

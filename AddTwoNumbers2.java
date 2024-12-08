import java.math.BigInteger;

public class AddTwoNumbers2 {
  ListNode head = null;
  ListNode tail = null;

  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    BigInteger n1 = makeNum(l1);
    BigInteger n2 = makeNum(l2);
    makeList(n1.add(n2));
    return head;
  }

  public void makeList(BigInteger bInt) {
    String str = bInt.toString();
    for (int i = str.length() - 1; i >= 0; i--) {
      insertS(str.charAt(i) - 48);
    }
  }

  public void insertS(int num) {
    ListNode n = new ListNode(num);
    if (head == null) {
      head = tail = n;
    } else {
      tail.next = n;
      tail = n;
    }
  }

  public BigInteger makeNum(ListNode node) {
    BigInteger res = BigInteger.ZERO;
    ListNode tempNode = node;
    while (tempNode != null) {

      int place = 1;
      place *= 10;
      tempNode = tempNode.next;
    }
    return res;
  }
}

class ListNode {
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

import java.util.LinkedList;
import java.util.Queue;

/**
 * ImplementStackUsingQueues255
 */
public class ImplementStackUsingQueues255 {

  class MyStack {

    Queue<Integer> q1;
    Queue<Integer> q2;

    public MyStack() {
      this.q1 = new LinkedList<>();
      this.q2 = new LinkedList<>();

    }

    public void push(int x) {
      if (q1.isEmpty()) {
        q1.add(x);
        while (!q2.isEmpty()) {
          q1.add(q2.poll());
        }
      } else {
        q2.add(x);
        while (!q1.isEmpty()) {
          q2.add(q1.poll());
        }
      }
    }

    public int pop() {
      if (!q1.isEmpty())
        return q1.poll();
      if (!q2.isEmpty())
        return q2.poll();
      return -1;
    }

    public int top() {
      if (!q1.isEmpty())
        return q1.peek();
      if (!q2.isEmpty())
        return q2.peek();
      return -1;
    }

    public boolean empty() {
      return q1.isEmpty() && q2.isEmpty();
    }
  }
}

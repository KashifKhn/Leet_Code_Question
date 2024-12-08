import java.util.List;
import java.util.Stack;
import java.util.ArrayList;

public class BinaryTreePreorderTraversa144 {
  public List<Integer> preorderTraversal(TreeNode root) {
    Stack<TreeNode> st = new Stack<>();
    List<Integer> list = new ArrayList<>();
    if (root != null) {
      st.push(root);
    }
    while (!st.isEmpty()) {
      TreeNode temp = st.pop();
      list.add(temp.val);
      if (temp.right != null) {
        st.push(temp.right);
      }
      if (temp.left != null) {
        st.push(temp.left);
      }
    }
    return list;

  }

  public static void main(String[] args) {

  }

  public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
      this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
      this.val = val;
      this.left = left;
      this.right = right;
    }
  }
}

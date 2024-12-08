// Question Link: 

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeInorderTraversal94 {

  public List<Integer> inorderTraversal(TreeNode root) {
    List<Integer> list = new ArrayList<>();
    inorderTraversal(root, list);
    return list;

  }

  public void inorderTraversal(TreeNode root, List<Integer> list) {
    if (root == null)
      return;
    inorderTraversal(root.left, list);
    list.add(root.val);
    inorderTraversal(root.right, list);

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

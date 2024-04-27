// public class inOrder {
  
// }

/**
 * Definition for a binary tree root.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
// Iterative Approach
class Solution {
  public List<Integer> inorderTraversal(TreeNode root) {
    List<Integer> ans = new ArrayList<Integer>();
    Stack<TreeNode> stack = new Stack<TreeNode>();
    // TreeNode root=root;
    while (true) {
      if (root != null) {
        stack.push(root);
        root = root.left;
      } // traversing to the left mist root
      else {
        if (stack.isEmpty()) {
          break;// break out of loop when the stack is empty
        } // if the stack is empty
        root = stack.pop();//
        ans.add(root.val);
        root = root.right;
      }
    }
    return ans;
  }
}
// /**
//  * Definition for a binary tree node.
//  * public class TreeNode {
//  *     int val;
//  *     TreeNode left;
//  *     TreeNode right;
//  *     TreeNode() {}
//  *     TreeNode(int val) { this.val = val; }
//  *     TreeNode(int val, TreeNode left, TreeNode right) {
//  *         this.val = val;
//  *         this.left = left;
//  *         this.right = right;
//  *     }
//  * }
//  */
// class Solution {
//     public List<List<Integer>> levelOrder(TreeNode root) {
//         Queue<TreeNode> q = new LinkedList<>();
//         List<List<Integer>> finalAns = new ArrayList<List<Integer>>();
//         if(root==null){
//             return finalAns;
//         }
//         q.add(root);
//         while(!q.isEmpty()){
//             int levels = q.size();
//             List<Integer> subLevels = new ArrayList<>();
//             for(int i=0;i<levels;i++){
//                 if(q.peek().left!=null){
//                     q.add(q.peek().left);
//                 }
//                 if(q.peek().right!=null){
//                     q.add(q.peek().right);
//                 }
//                 subLevels.add(q.remove().val);
//             }
//             finalAns.add(subLevels);
//         }
//         return finalAns;
//     }
// }
class Solution {
  public List<List<Integer>> levelOrder(TreeNode root) {
    Queue<TreeNode> que = new LinkedList<TreeNode>();// making a queue to store the nodes to discover
    List<List<Integer>> ans = new LinkedList<List<Integer>>();
    // maintaing ans of list type
    if (root == null) {
      return ans;// no node in the tree
    }
    que.offer(root);// storing the root node in the queue to explore
    while (!que.isEmpty()) {
      int level = que.size();// the size of que will tell the number of node that node has
      List<Integer> sublist = new LinkedList<Integer>();
      for (int i = 0; i < level; i++) {
        if (que.peek().left != null) {
          // if the left child is not null of the current node
          que.offer(que.peek().left);
          // adding the left child to the que
        }
        if (que.peek().right != null) {
          // if the right child is not null of the current node
          que.offer(que.peek().right);
          // adding to the que the right child of current node
        }
        sublist.add(que.poll().val);
        // adding the new explored node to the sublist
      }
      ans.add(sublist);
      // adding the sublist to the ans list
    }
    return ans;
  }
}

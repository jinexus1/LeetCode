/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
  public boolean isBalanced(TreeNode root) {
      return height(root)!=-1;
  }
  public int height(TreeNode root){
      if(root==null)
      return 0;//a binary tree with zero nodes is balanced tree
      int Hl=height(root.left);
      int Hr=height(root.right);
      if(Hl==-1 || Hr==-1){
          return -1;
      } 
      if(Math.abs(Hr-Hl)>1){
          return -1;
      }
      return  1+Math.max(Hr,Hl);
  }
}
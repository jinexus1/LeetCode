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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Queue<TreeNode> nodes = new LinkedList<>();
        List<List<Integer>> ans = new ArrayList<>();
        if(root == null)
            return ans;
        boolean flag = true;
        nodes.add(root);
        while (!nodes.isEmpty()) {
            int n = nodes.size();
            List<Integer> temp = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                temp.add(nodes.peek().val);

                if (nodes.peek().left != null) {
                    nodes.add(nodes.peek().left);
                }
                if (nodes.peek().right != null) {
                    nodes.add(nodes.peek().right);
                }
                nodes.poll();
            }
            if(!flag){
                Collections.reverse(temp);
            }
            ans.add(temp);
            flag = !flag;
        }
        return ans;
    }
}
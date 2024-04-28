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
//     public int diameterOfBinaryTree(TreeNode root) {
//         int max=0,max1=0;
//         if(root==null){
//             return 0;
//         }
//         // if(root.left==null||root.right==null)
//         // return 1;
//         // int ans=findMax(root);
//         // return ans;
//         else{
//             TreeNode temp=root;
//             while(temp!=null){
//                  max=Math.max(findMax(root),max);
//                 temp=temp.right;
//             }
//             temp=root;
//             while(temp!=null){
//                  max1=Math.max(findMax(root),max1);
//                 temp=temp.left;
//             }
//         }
//         return Math.max(max,max1);

//     }
//     public int findMax(TreeNode root){
//         if(root==null) 
//         return 0;
//         int Hl=findLeftHeight(root.left);//Finding the 
//         int Hr=findRightHeight(root.right);
//         int max=0;
//          max=Math.max(max,Hl+Hr);
//         //findMax(root.left);
//         findMax(root.left);
//         findMax(root.right);
//         return max;
//     }
//     public int findLeftHeight(TreeNode rl){
//         if(rl==null){
//             return 0;
//         }
//         return findLeftHeight(rl.left)+1;
//     }
//     public int findRightHeight(TreeNode rr){
//         if(rr==null){
//             return 0;
//         }
//         return findRightHeight(rr.right)+1;
//     }
// }
public class Solution{
    public int diameterOfBinaryTree(TreeNode root){
        int []diameter=new int[1];//used diamater becase normal value are passed by value
        int temp=height(root,diameter);
        return diameter[0];
    }
    private int height(TreeNode node,int diameter[]){
        if(node==null){
            return 0;
        }
        int Hl=height(node.left,diameter);
        int Hr=height(node.right,diameter);
        diameter[0]=Math.max(diameter[0],Hl+Hr);
        return 1+Math.max(Hl,Hr);
    }
}
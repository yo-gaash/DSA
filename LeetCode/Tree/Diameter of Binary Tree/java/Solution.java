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
    int diameter;
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null){
            return 0;
        }
        diameter = Math.max(diameterOfBinaryTree(root.left),diameterOfBinaryTree(root.right));
        int leftMax = height(root.left);
        int rightMax = height(root.right);
        return Math.max(diameter,leftMax+rightMax);
    }
    public static int height(TreeNode root){
        if(root==null){
            return 0;
        }
        int leftMax = height(root.left);
        int rightMax = height(root.right);
        return 1+Math.max(leftMax,rightMax);
    }
}
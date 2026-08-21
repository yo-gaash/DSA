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
        List<List<Integer>> zigzagLevelOrder = new ArrayList<>();
        if(root==null){
            return zigzagLevelOrder;
        }
        Deque<TreeNode> dq = new LinkedList<>();
        dq.addFirst(root);
        boolean reverse = false;
        while(!dq.isEmpty()){
            int size = dq.size();
            List<Integer> temp = new ArrayList<>();
            for(int i=0;i<=size-1;i++){
                if(!reverse){
                    TreeNode current = dq.pollFirst();
                    temp.add(current.val);
                    if(current.left!=null){
                        dq.addLast(current.left);
                    }
                    if(current.right!=null){
                        dq.addLast(current.right);
                    }
                }
                else{
                    TreeNode current = dq.pollLast();
                    temp.add(current.val);
                    if(current.right!=null){
                        dq.addFirst(current.right);
                    }
                    if(current.left!=null){
                        dq.addFirst(current.left);
                    }
                }
            }
            reverse = !reverse;
            zigzagLevelOrder.add(temp);
        }
        return zigzagLevelOrder;
    }
}
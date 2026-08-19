// Last updated: 8/19/2026, 10:37:49 AM
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
    public boolean isCompleteTree(TreeNode root) {
        if(root==null) return true;
        Queue<TreeNode> q= new LinkedList<>();
        q.offer(root);
        while(q.peek()!=null)
        {
            TreeNode temp=q.poll();
            q.offer(temp.left);
            q.offer(temp.right);
        }
        while(!q.isEmpty() && q.peek()==null)
        q.poll();
        return q.isEmpty();
    }
}
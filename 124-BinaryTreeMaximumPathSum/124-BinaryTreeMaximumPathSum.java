// Last updated: 8/19/2026, 10:40:37 AM
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
    int res=Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        process(root);
        return res;
    }
    public int process(TreeNode root)
    {
        if(root==null) return 0;
        int left=Math.max(process(root.left),0);
        int right=Math.max(process(root.right),0);
        int sum=root.val+left+right;
        res=Math.max(res,sum);
        return root.val+Math.max(left,right);
    }
}
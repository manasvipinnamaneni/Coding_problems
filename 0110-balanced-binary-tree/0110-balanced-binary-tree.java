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
        if(root == null)
            return true;
        return height_check(root) != -1;
    }
    private int height_check(TreeNode root) {
        if(root == null)
            return 0;
        int left_height = height_check(root.left);
        if(left_height == -1)
            return -1;
        int right_height = height_check(root.right);
        if(right_height == -1)
            return -1;
        if(Math.abs(left_height - right_height) > 1)
            return -1;
        return 1 + Math.max(left_height, right_height);
    }
}
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
    ArrayList<Integer> list = new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
        preorder(root, list);
        return list;
    }
    private void preorder(TreeNode root, List<Integer> list) {
        if(root == null)
            return;
        list.add(root.val);
        preorder(root.left, list);
        preorder(root.right, list);
    }
}
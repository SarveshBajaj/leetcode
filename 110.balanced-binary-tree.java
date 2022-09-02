/*
 * @lc app=leetcode id=110 lang=java
 *
 * [110] Balanced Binary Tree
 */

// @lc code=start
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
        return getHeight(root) == -1 ? false : true;
    }

    public int getHeight(TreeNode node){
        if (node == null)
            return 0;
        int left = getHeight(node.left);
        int right = getHeight(node.right);
        int result = Math.abs(left - right);
        if(left == -1 || right == -1 || result > 1)
            return -1;
        return Math.max(left, right) + 1;
    }
}
// @lc code=end


/*
 * @lc app=leetcode id=105 lang=java
 *
 * [105] Construct Binary Tree from Preorder and Inorder Traversal
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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return helper(0, 0, inorder.length-1, preorder, inorder);
    }

    public TreeNode helper(int prestart, int instart, int inend, int[] preorder, int[] inorder){   
        if(instart>inend || prestart > preorder.length-1)
            return null;
        TreeNode node = new TreeNode(preorder[prestart]);
        int index = 0;
        for(int i = instart;i<=inend;i++){
            if(inorder[i]==preorder[prestart]) 
                index = i;
        }
        node.left = helper(prestart+1, instart, index-1, preorder, inorder);
        node.right = helper(prestart+index-instart+1, index+1, inend, preorder, inorder);
        return node;
    }
}
// @lc code=end


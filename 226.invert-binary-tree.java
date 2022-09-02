import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

/*
 * @lc app=leetcode id=226 lang=java
 *
 * [226] Invert Binary Tree
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
    public TreeNode invertTree(TreeNode root) {
        if(root==null)
            return root;
        Stack<TreeNode> stack = new Stack<>();
        stack.add(root);
        TreeNode top = root;
        while(!stack.isEmpty()){
            root = stack.pop();
            if(root!=null){
                TreeNode node = root.left;
                root.left = root.right;
                root.right = node;
            }
            if(root.left!=null)
                stack.push(root.left);
            if(root.right!=null)
                stack.push(root.right);
        }
        return top;
    }
}
// @lc code=end


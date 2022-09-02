import java.util.ArrayList;
import java.util.Collections;

/*
 * @lc app=leetcode id=230 lang=java
 *
 * [230] Kth Smallest Element in a BST
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
    public int kthSmallest(TreeNode root, int k) {
        ArrayList<Integer> a = new ArrayList<>();
        a = helper(root, a);
        return a.get(k-1);
    }

    public ArrayList<Integer> helper(TreeNode root, ArrayList<Integer> a){
        if(root == null)
            return a;
        a = helper(root.left, a);
        a.add(root.val);
        a = helper(root.right, a);
        return a;
    }
}
// @lc code=end


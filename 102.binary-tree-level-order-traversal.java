import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/*
 * @lc app=leetcode id=102 lang=java
 *
 * [102] Binary Tree Level Order Traversal
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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int count = 1;
        while(!q.isEmpty()){
            List<Integer> innerList = new ArrayList<>();
            while(count-- > 0){
                TreeNode node = q.poll();
                if(node == null)
                    continue;
                innerList.add(node.val);
                q.add(node.left);
                q.add(node.right);
            }
            count = q.size();
            if(!innerList.isEmpty())
                result.add(innerList);
        }
        return result;
    }
}
// @lc code=end


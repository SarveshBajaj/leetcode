import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
 
public class Scratch {

    public static TreeNode sortedArrayToBST(int[] nums) {
        return helper(0, nums.length-1, nums);
    }

    public static TreeNode helper(int start, int end, int[] nums){
        if(start>end)
            return null;
        int mid = start + (end - start)/2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = helper(start, (mid-1), nums);
        node.right = helper((mid+1), end, nums);
        return node;
    }

    public static void main(String[] args){
        TreeNode node = new TreeNode(3);
        node.left = new TreeNode(1);
        node.right = new TreeNode(4);
        node.left.right = new TreeNode(2);
        System.out.println(Scratch.sortedArrayToBST(new int[] {-10,-3,0,5,9}));
    }
}

package Leetcode;

import javax.swing.tree.TreeNode;
import java.util.Stack;


public class RangeSumOfBST {

    int val;
    TreeNode left;
    TreeNode right;

    public RangeSumOfBST(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

}
public class Retrieve {

    public static int rangeSumBST(TreeNode root, int low, int high) {

        int range_sum = 0;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            if (node != null) {
                if (node.val >= low && node.val <= high) {
                    range_sum += node.val;
                }
                if (node.val > low && node.left != null) {
                    stack.push(node.left);
                }
                if (node.val < high && node.right != null) {
                    stack.push(node.right);
                }
            }
        }
        return range_sum;
    }

}










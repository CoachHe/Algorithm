package 第4章_解决面试题的思路.第2节_画图让抽象问题形象化.面试题28_对称的二叉树;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}

public class Solution {


    boolean isSymmetrical(TreeNode pRoot)
    {
        if (pRoot == null) {
            return false;
        }
        List<TreeNode> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        stack.push(pRoot);
        list.add(pRoot);
        TreeNode node;
        while (!stack.isEmpty()) {
            node = stack.pop();
            if (node.left != null || node.right != null) {
                list.add(node.left);
                list.add(node.right);
            }
            if (node.left != null) {
                stack.push(node.left);
            }
            if (node.right != null) {
                stack.push(node.right);
            }
        }
        for (TreeNode tmp : list) {
            System.out.println(tmp.val);
        }
        return false;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(8);
        root.left = new TreeNode(6);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(5);
        root.left.right = new TreeNode(7);
        root.right.left = new TreeNode(7);
        root.right.right = new TreeNode(5);
        Solution s = new Solution();
        s.isSymmetrical(root);
    }
}
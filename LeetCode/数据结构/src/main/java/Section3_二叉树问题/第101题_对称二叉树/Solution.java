package Section3_二叉树问题.第101题_对称二叉树;


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

public class Solution {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        TreeNode leftNode = root.left;
        TreeNode rightNode = root.right;
        return tmpJudge(leftNode, rightNode);
    }

    public boolean tmpJudge(TreeNode leftNode, TreeNode rightNode) {
        if (leftNode == null && rightNode == null) {
            return true;
        } else if (leftNode == null) {
            return false;
        } else if (rightNode == null) {
            return false;
        } else if (leftNode.val != rightNode.val) {
            return false;
        }
        return tmpJudge(leftNode.left, rightNode.right) && tmpJudge(leftNode.right, rightNode.left);
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        //root.left.left = new TreeNode(3);
        //root.left.right = new TreeNode(4);
        //root.right.left = new TreeNode(4);
        //root.right.right = new TreeNode(3);
        //root.right.right.right = new TreeNode(5);
        System.out.println(s.isSymmetric(root));
    }
}


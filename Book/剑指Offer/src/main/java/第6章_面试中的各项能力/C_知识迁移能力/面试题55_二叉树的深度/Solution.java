package 第6章_面试中的各项能力.C_知识迁移能力.面试题55_二叉树的深度;


class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;
    public TreeNode(int val) {
        this.val = val;
    }

}

public class Solution {

    public int TreeDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int length = Depth(root, 0);
        return length;
    }

    public int Depth(TreeNode root, int length) {
        if (root == null) {
            return length;
        }
        length++;
        return Math.max(Depth(root.left, length), Depth(root.right, length));
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        TreeNode treeNode = new TreeNode(1);
        treeNode.left = new TreeNode(2);
        treeNode.left.left = new TreeNode(4);
        treeNode.left.right = new TreeNode(5);
        treeNode.left.right.left = new TreeNode(7);
        treeNode.right = new TreeNode(3);
        System.out.println(s.TreeDepth(treeNode));
    }
}
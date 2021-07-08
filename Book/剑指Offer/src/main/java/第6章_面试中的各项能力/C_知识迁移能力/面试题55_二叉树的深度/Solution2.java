package 第6章_面试中的各项能力.C_知识迁移能力.面试题55_二叉树的深度;

public class Solution2 {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return Math.max(tmpDepth(root.left, 1), tmpDepth(root.right, 1));
    }

    public int tmpDepth(TreeNode treeNode, int depth) {
        if (treeNode == null) {
            return depth;
        }
        return Math.max(tmpDepth(treeNode.left, depth + 1), tmpDepth(treeNode.right, depth + 1));
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        Solution2 s = new Solution2();
        System.out.println(s.maxDepth(root));
    }

}

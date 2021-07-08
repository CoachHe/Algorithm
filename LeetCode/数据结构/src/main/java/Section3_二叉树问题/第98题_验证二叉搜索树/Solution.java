package Section3_二叉树问题.第98题_验证二叉搜索树;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

public class Solution {

    public boolean isValidBST(TreeNode root) {
        return tmpValid(root, root.val, root.val);
    }

    public boolean tmpValid(TreeNode treeNode, int tmp_max, int tmp_min) {
        if (treeNode == null) {
            return true;
        } else if (treeNode.left == null && treeNode.right == null) {
            return true;
        } else if (treeNode.left != null && (treeNode.left.val > treeNode.val || treeNode.left.val > tmp_min)) {
            return false;
        } else if (treeNode.right != null && (treeNode.right.val < treeNode.val || treeNode.right.val < tmp_max)) {
            return false;
        }
        return tmpValid(treeNode.left, tmp_max, tmp_min) && tmpValid(treeNode.right, tmp_max, tmp_min);
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(2);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right.left = new TreeNode(7);
        root.right.right = new TreeNode(10);
        System.out.println(s.isValidBST(root));
    }

}

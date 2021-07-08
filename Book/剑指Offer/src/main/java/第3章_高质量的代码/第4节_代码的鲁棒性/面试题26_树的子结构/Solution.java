package 第3章_高质量的代码.第4节_代码的鲁棒性.面试题26_树的子结构;


class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}

public class Solution {
    public boolean HasSubtree(TreeNode root1, TreeNode root2) {
        if (root1 == null || root2 == null) {
            return false;
        }
        if (root1.val == root2.val) {
            if (partTrue(root1, root2)) {
                return true;
            } else {
                return HasSubtree(root1.left, root2) || HasSubtree(
                        root1.right, root2
                );
            }
        }
        return false;
    }

    public boolean partTrue(TreeNode Apart, TreeNode root2) {
        if (root2 == null) {
            return true;
        } else if (Apart == null) {
            return false;
        }  else if (Apart.val != root2.val) {
            return false;
        } else {
            return partTrue(Apart.left, root2.left) && partTrue(
                    Apart.right, root2.right
            );
        }
    }

    public static void main(String[] args) {
        TreeNode root1 = new TreeNode(8);
        root1.left = new TreeNode(8);
        root1.right = new TreeNode(7);
        root1.left.left = new TreeNode(9);
        root1.left.right = new TreeNode(2);
        root1.left.right.left = new TreeNode(4);
        root1.left.right.right = new TreeNode(7);
        TreeNode root2 = new TreeNode(8);
        root2.left = new TreeNode(9);
        root2.right = new TreeNode(2);
        Solution s = new Solution();
        System.out.println(s.HasSubtree(root1, root2));
    }
}
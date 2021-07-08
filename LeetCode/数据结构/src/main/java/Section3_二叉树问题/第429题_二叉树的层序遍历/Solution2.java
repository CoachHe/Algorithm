package Section3_二叉树问题.第429题_二叉树的层序遍历;

import java.util.ArrayList;
import java.util.List;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

public class Solution2 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        List<TreeNode> node = new ArrayList<>();
        if (root == null) {
            return res;
        }
        node.add(root);
        while (!node.isEmpty()) {
            int len = node.size();
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < len; i++) {
                TreeNode remove = node.remove(0);
                list.add(remove.val);
                if (remove.left != null) {
                    node.add(remove.left);
                }
                if (remove.right != null) {
                    node.add(remove.right);
                }
            }
            res.add(list);
        }
        return res;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        Solution2 s = new Solution2();
        List<List<Integer>> res = s.levelOrder(root);
        for (List<Integer> tmp : res) {
            for (int tmptmp : tmp) {
                System.out.print(tmptmp + " ");
            }
            System.out.println();
        }
    }



}

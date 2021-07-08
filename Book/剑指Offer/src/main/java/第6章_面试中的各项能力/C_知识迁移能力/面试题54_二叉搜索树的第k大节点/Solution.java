package 第6章_面试中的各项能力.C_知识迁移能力.面试题54_二叉搜索树的第k大节点;


import sun.reflect.generics.tree.Tree;

import java.util.ArrayList;
import java.util.List;

class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}

public class Solution {
    TreeNode KthNode(TreeNode pRoot, int k){
        if (pRoot == null || k <= 0) {
            return null;
        }
        list = midbianli(pRoot);
        return list.get(k - 1);
    }
    List<TreeNode> list = new ArrayList<>();
    public List<TreeNode> midbianli(TreeNode pRoot) {
        if (pRoot == null) {
            return null;
        }
        midbianli(pRoot.left);
        list.add(pRoot);
        midbianli(pRoot.right);
        return list;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        TreeNode root = new TreeNode(8);
        root.left = new TreeNode(6);
        root.right = new TreeNode(10);
        root.left.left = new TreeNode(5);
        root.left.right = new TreeNode(7);
        root.right.left = new TreeNode(9);
        root.right.right = new TreeNode(11);
        List<TreeNode> list = s.midbianli(root);
        for (TreeNode treeNode : list) {
            System.out.print(treeNode.val + " ");
        }
        System.out.println();
        System.out.println(s.KthNode(root, 1).val);
    }
}
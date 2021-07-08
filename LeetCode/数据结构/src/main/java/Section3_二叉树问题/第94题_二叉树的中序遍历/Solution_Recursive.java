package Section3_二叉树问题.第94题_二叉树的中序遍历;


import Section4_递归和动态规划.链表.TreeNode2;

import java.util.ArrayList;
import java.util.List;

public class Solution_Recursive {
    List<Integer> out = new ArrayList<>();
    List<Integer> list = new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode2 root) {
        if (root == null) {
            return out;
        }
        inorderTraversal(root.left);
        list.add(root.val);
        inorderTraversal(root.right);
        return list;
    }
    public static void main(String[] args) {
        TreeNode2 root = new TreeNode2(1);
        root.left = new TreeNode2(2);
        root.right = new TreeNode2(3);
        root.left.left = new TreeNode2(4);
        root.left.right = new TreeNode2(5);
        root.right.left = new TreeNode2(6);
        root.right.right = new TreeNode2(7);
        Solution_Recursive s = new Solution_Recursive();
        List<Integer> list = s.inorderTraversal(root);
        System.out.println(list.size());
        for (int tmp : list) {
            System.out.print(tmp + " ");
        }
    }
}

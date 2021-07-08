package Section3_二叉树问题.第103题_二叉树的锯齿形层序遍历;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

public class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        List<TreeNode> list = new ArrayList<>();
        list.add(root);
        int index = 1;
        while (!list.isEmpty()) {
            int len = list.size();
            List<Integer> tmp = new ArrayList<>();
            for (int i = 0; i < len; i++) {
                TreeNode remove = list.remove(0);
                tmp.add(remove.val);
                if (remove.left != null) {
                    list.add(remove.left);
                }
                if (remove.right != null) {
                    list.add(remove.right);
                }
            }
            if (index % 2 != 1) {
                Stack<Integer> stack = new Stack<>();
                while (!tmp.isEmpty()) {
                    stack.push(tmp.remove(0));
                }
                while (!stack.isEmpty()) {
                    tmp.add(stack.pop());
                }
            }
            res.add(tmp);
            index++;
        }
        return res;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        Solution s = new Solution();
        List<List<Integer>> res = s.zigzagLevelOrder(root);
        for (List<Integer> tmp : res) {
            for (int tmptmp : tmp) {
                System.out.print(tmptmp + " ");
            }
            System.out.println();
        }

    }

}

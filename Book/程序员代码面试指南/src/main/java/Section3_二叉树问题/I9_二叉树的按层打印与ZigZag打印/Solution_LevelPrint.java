package Section3_二叉树问题.I9_二叉树的按层打印与ZigZag打印;


import Section3_二叉树问题.二叉树.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class Solution_LevelPrint {
    public void printZ(TreeNode root) {
        if (root == null) {
            return;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        int level = 1;
        queue.add(root);
        TreeNode last = root;
        TreeNode nlast = null;
        System.out.print("Level " + (level++) + ": ");
        while (!queue.isEmpty()) {
            root = queue.poll();
            System.out.print(root.val + " ");
            if (root.left == last) {
                queue.offer(root.left);
                nlast = root.left;
            }
            if (root.right == last) {
                queue.offer(root.right);
                nlast = root.right;
            }
            if (root == last && !queue.isEmpty()) {
                System.out.print("\nLevel " + (level++) + " : ");
                last = nlast;
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {

    }
}

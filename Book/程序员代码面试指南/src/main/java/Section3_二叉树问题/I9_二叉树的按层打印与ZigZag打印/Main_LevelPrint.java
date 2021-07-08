package Section3_二叉树问题.I9_二叉树的按层打印与ZigZag打印;

import java.util.LinkedList;
import java.util.Queue;

public class Main_LevelPrint {
    public static void printByLevel(Node root) {
        if (root == null) {
            return;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        int level = 1;
        Node last = root;
        Node nlast = null;
        System.out.print("Level " + level++ + ": ");
        while (!queue.isEmpty()) {
            root = queue.poll();
            System.out.print(root.value + " ");
            if (root.left != null) {
                queue.offer(root.left);
                nlast = root.left;
            }
            if (root.right != null) {
                queue.offer(root.right);
                nlast = root.right;
            }
            if (root == last && !queue.isEmpty()) {
                System.out.println();
                System.out.print("Level " + level++ +": ");
                last = nlast;
            }
        }
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.right.left = new Node(5);
        root.right.right = new Node(6);
        root.right.left.left = new Node(7);
        root.right.left.right = new Node(8);
        printByLevel(root);
    }
}



package Section3_二叉树问题.I9_二叉树的按层打印与ZigZag打印;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Solution_ZigZag {
    public static void printZ(Node root) {
        if (root == null) {
            return;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        int level = 1;
        Node last = root;
        Node nlast = null;
        boolean judge = false;
        ArrayList<Node> arrayList = new ArrayList<>();
        System.out.print("Level " + level++ + ": ");
        while (!queue.isEmpty()) {
            root = queue.poll();
            arrayList.add(root);
            if (root.left != null) {
                queue.offer(root.left);
                nlast = root.left;
            }
            if (root.right != null) {
                queue.offer(root.right);
                nlast = root.right;
            }
            if (root == last && !queue.isEmpty()) {
                if (judge) {
                    for (int i = arrayList.size() - 1; i >= 0; i--) {
                        System.out.print(arrayList.get(i).value + " ");
                    }
                } else {
                    for (int i = 0; i <= arrayList.size() - 1; i++) {
                        System.out.print(arrayList.get(i).value + " ");
                    }
                }
                arrayList.clear();
                judge = !judge;
                System.out.println();
                System.out.print("Level " + level++ + ": ");
                last = nlast;
            }
        }
        if (judge) {
            for (int i = arrayList.size() - 1; i >= 0; i--) {
                System.out.print(arrayList.get(i).value + " ");
            }
        } else {
            for (int i = 0; i <= arrayList.size() - 1; i++) {
                System.out.print(arrayList.get(i).value + " ");
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
        printZ(root);
    }
}



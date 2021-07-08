package Section3_二叉树问题.第919题_完全二叉树插入器;


import Section2_链表问题.链表.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class CBTInserter {
    public CBTInserter(TreeNode root) {


    }

    public int insert(int v) {

        return 0;
    }

    public TreeNode get_root() {

        return null;
    }

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        queue.poll();
        queue.offer(1);
        System.out.println(queue);
        System.out.println(queue.peek());
        System.out.println(queue.add(6));
    }
}

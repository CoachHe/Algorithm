package 第6章_面试中的各项能力.C_知识迁移能力.面试题62_圆圈中最后剩下的数字;

import java.util.Stack;

public class Solution {
    public int LastRemaining_Solution(int n, int m) {
        if (n <= 0 || m <= 0) {
            return -1;
        }
        Node root = new Node(0);
        Node head = root;
        for (int i = 1; i < n; i++) {
            root.next = new Node(i);
            root = root.next;
        }
        root.next = head;
        int index = 1;
        while (head.next != head) {
            index++;
            if (index == m) {
                head.next = head.next.next;
                index = 1;
            }
            head = head.next;
        }
        return head.val;
    }

    class Node{
        public int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.LastRemaining_Solution(5, 3));
    }
}

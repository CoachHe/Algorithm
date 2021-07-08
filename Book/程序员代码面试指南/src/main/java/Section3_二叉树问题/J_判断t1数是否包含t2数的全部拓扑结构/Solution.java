package Section3_二叉树问题.J_判断t1数是否包含t2数的全部拓扑结构;


import Section3_二叉树问题.二叉树.Node;

public class Solution {
    public static boolean contains(Node head1, Node head2) {
        if (head2 == null) {
            return true;
        }
        if (head1 == null) {
            return false;
        }
        boolean res;
        if (head1.value == head2.value) {
            res = check(head1, head2);
        } else {
            return contains(head1.left, head2) || contains(head1.right, head2);
        }
        return res;
    }

    public static boolean check(Node t1, Node t2) {
        if (t2 == null) {
            return true;
        }
        if (t1 == null || t1.value != t2.value) {
            return false;
        }
        return check(t1.left, t2.left) && check(t1.right, t2.right);
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        Node head1 = new Node(1);
        head1.left = new Node(2);
        head1.right = new Node(3);
        head1.left.left = new Node(4);
        head1.left.right = new Node(5);
        head1.right.left = new Node(6);
        head1.right.right = new Node(7);
        head1.left.left.left = new Node(8);
        head1.left.left.right = new Node(9);
        head1.left.right.left = new Node(10);
        Node head2 = new Node(2);
        head2.left = new Node(4);
        head2.right = new Node(5);
        head2.left.left = new Node(8);
        contains(head1,head2);
        System.out.println(contains(head1,head2));
    }
}

package Section3_二叉树问题.A2_分别用递归和非递归方式实现二叉树中序遍历;


import Section3_二叉树问题.二叉树.Node;

public class Solution_Recursive_inOrder {
    public static void inOrderRecur(Node head) {
        if (head == null) {
            return;
        }
        inOrderRecur(head.left);
        System.out.print(head.value + " ");
        inOrderRecur(head.right);
    }
    public static void main(String[] args) {
        Node head = new Node(1);
        head.left = new Node(2);
        head.right = new Node(3);
        head.left.left = new Node(4);
        head.left.right = new Node(5);
        head.right.left = new Node(6);
        head.right.right = new Node(7);
        inOrderRecur(head);
    }
}

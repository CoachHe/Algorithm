package Section3_二叉树问题.A2_分别用递归和非递归方式实现二叉树中序遍历;


import Section3_二叉树问题.二叉树.Node;

public class Mine_Recursive_inOrder {
    public void inOrderRecur(Node head) {
        if (head == null) {
            return;
        }
        inOrderRecur(head.left);
        System.out.print(head.value + " ");
        inOrderRecur(head.right);
    }
}

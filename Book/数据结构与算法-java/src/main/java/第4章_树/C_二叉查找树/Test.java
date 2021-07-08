package 第4章_树.C_二叉查找树;


import 第4章_树.B_二叉树.BinaryNode;

public class Test {
    public static void main(String[] args) {
        BinaryNode b3 = new BinaryNode(3, null, null);
        BinaryNode b4 = new BinaryNode(4, b3, null);
        BinaryNode b1 = new BinaryNode(1, null, null);
        BinaryNode b2 = new BinaryNode(2, b1, b4);
        BinaryNode b8 = new BinaryNode(8, null, null);
        BinaryNode b6 = new BinaryNode(6, b2, b8);
        BTree bTree = new BTree();
        System.out.println(bTree.remove(2, b6).left.element);
        System.out.println(bTree.remove(10, b6).element);
        System.out.println(bTree.remove(6, b6).element);
    }
}

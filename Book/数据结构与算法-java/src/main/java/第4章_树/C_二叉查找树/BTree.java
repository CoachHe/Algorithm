package 第4章_树.C_二叉查找树;


import 第4章_树.B_二叉树.BinaryNode;

public class BTree<AnyType extends Comparable<? super AnyType>> {
    public BinaryNode remove(AnyType x, BinaryNode t) {
        if (t == null) {
            return t;
        }
        int compareResult = (x.compareTo((AnyType)t.element));
        if (compareResult < 0) {
            t.left = remove(x, t.left);
        } else if (compareResult > 0) {
            t.right = remove(x, t.right);
        } else if (t.left != null && t.right != null) {
            t.element = findMin(t.right).element;
            t.right = remove((AnyType)t.element, t.right);
        } else {
            t = (t.left != null) ? t.left : t.right;
        }
        return t;
    }

    public BinaryNode findMin(BinaryNode root) {
        if (root == null) {
            return null;
        }
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }
}

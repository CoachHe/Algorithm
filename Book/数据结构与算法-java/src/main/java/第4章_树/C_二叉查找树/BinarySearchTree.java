package 第4章_树.C_二叉查找树;

import java.nio.BufferUnderflowException;

public class BinarySearchTree<AnyType extends Comparable<? super AnyType>> {
    public BinarySearchTree() {

    }

    private static class BinaryNode<AnyType> {
        //Constructors
        BinaryNode(AnyType theElement) {
            this(theElement, null, null);
        }

        BinaryNode(AnyType theElement, BinaryNode<AnyType> lt, BinaryNode<AnyType> rt) {
            element = theElement;
            left = lt;
            right = rt;
        }

        AnyType element;            //The data in the node
        BinaryNode<AnyType> left;   //Left child
        BinaryNode<AnyType> right;  //Right child
    }

    private BinaryNode<AnyType> root;

    BinarySearchTree(int i, Object o, Object o1) {
        root = null;
    }

    public void makeEmpty() {
        root = null;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public boolean contains(AnyType x) {
        return contains(x, root);
    }

    public AnyType findMin() {
        if (isEmpty()) {
            throw new BufferUnderflowException();
        }
        return findMin(root).element;
    }

    public AnyType findMax() {
        if (isEmpty()) {
            throw new BufferUnderflowException();
        }
        return findMax(root).element;
    }

    public void insert(AnyType x) {
        root = insert(x, root);
    }

    public BinaryNode<AnyType> remove(AnyType x, BinaryNode<AnyType> t) {
        if (t == null) {
            return t;
        }
        int compareResult = x.compareTo(t.element);
        if (compareResult < 0) {
            t.left = remove(x, t.left);
        } else if (compareResult > 0) {
            t.right = remove(x, t.right);
        } else if (t.left != null && t.right != null) {
            t.element = findMin(t.right).element;
            t.right = remove(t.element, t.right);
        } else {
            t = (t.left != null) ? t.left : t.right;
        }
        return t;
    }

    public void printTree() {
        //4.56
    }

    public boolean contains(AnyType x, BinaryNode<AnyType> typeBinaryNode) {
        //4.18
        return false;
    }

    public BinaryNode<AnyType> findMin(BinaryNode<AnyType> typeBinaryNode) {
        //4.20
        return null;
    }

    public BinaryNode<AnyType> findMax(BinaryNode<AnyType> typeBinaryNode) {
        //4.20
        return null;
    }

    private BinaryNode<AnyType> insert(AnyType x, BinaryNode<AnyType> typeBinaryNode) {
        //4.22
        return null;
    }


    private void printTree(BinaryNode<AnyType> typeBinaryNode) {
        //4.56
    }


}

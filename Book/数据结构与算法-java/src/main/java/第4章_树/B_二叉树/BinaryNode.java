package 第4章_树.B_二叉树;

public class BinaryNode {
        //Friendly data; accessible by other package routines
    public Object element;
    public BinaryNode left;
    public BinaryNode right;

    public BinaryNode(Object element, BinaryNode left, BinaryNode right) {
        this.element = element;
        this.left = left;
        this.right = right;
    }
}

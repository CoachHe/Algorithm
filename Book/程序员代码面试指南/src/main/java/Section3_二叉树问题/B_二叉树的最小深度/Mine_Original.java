package Section3_二叉树问题.B_二叉树的最小深度;


import Section3_二叉树问题.二叉树.Node;

public class Mine_Original {
    public int minDepth(Node head){
        if (head == null) {
            return 0;
        }
        return process(head, 1);
    }

    public int process(Node node, int level) {
        if (node.left == null && node.right == null) {
            return level;
        }
        int ans = Integer.MAX_VALUE;
        if (node.left != null) {
            int finalans = process(node.left, level + 1);
            ans = Math.min(finalans, ans);
        }
        if (node.right != null) {
            ans = Math.min(process(node.right, level + 1), ans);
        }
        return ans;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.right = new Node(2);
        head.right.left = new Node(3);
        head.right.left.left = new Node(4);
        head.right.left.right = new Node(5);
        head.right.left.left.right = new Node(6);
        Mine_Original s = new Mine_Original();
        System.out.println(s.minDepth(head));
    }
}

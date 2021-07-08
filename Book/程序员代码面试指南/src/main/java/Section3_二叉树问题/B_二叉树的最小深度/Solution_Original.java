package Section3_二叉树问题.B_二叉树的最小深度;


import Section3_二叉树问题.二叉树.Node;

public class Solution_Original {
    public int minDepth1(Node head) {
        if (head == null) {
            return 0;
        }
        return process(head, 1);
    }

    public int process(Node cur, int level) {
        //发现页节点了，返回它的高度
        if (cur.left == null && cur.right == null) {
            return level;
        }
        int ans = Integer.MAX_VALUE;
        if (cur.left != null) {
            ans = Math.min(process(cur.left, level + 1), ans);
        }
        if (cur.right != null) {
            ans = Math.min(process(cur.right, level + 1), ans);
        }
        return ans;
    }
}

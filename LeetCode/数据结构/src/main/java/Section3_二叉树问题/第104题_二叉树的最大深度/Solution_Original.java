package Section3_二叉树问题.第104题_二叉树的最大深度;


import Section4_递归和动态规划.链表.TreeNode2;

class Solution_Original {
    public int maxDepth(TreeNode2 head){
        if (head == null) {
            return 0;
        }
        return process(head, 1);
    }
    public int process(TreeNode2 node, int level) {
        if (node.left == null && node.right == null) {
            return level;
        }
        int ans = Integer.MIN_VALUE;
        if (node.left != null) {
            int finalans = process(node.left, level + 1);
            ans = Math.max(finalans, ans);
        }
        if (node.right != null) {
            ans = Math.max(process(node.right, level + 1), ans);
        }
        return ans;
    }

}

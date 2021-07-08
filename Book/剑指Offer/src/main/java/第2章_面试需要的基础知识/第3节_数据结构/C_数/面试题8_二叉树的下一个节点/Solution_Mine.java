package 第2章_面试需要的基础知识.第3节_数据结构.C_数.面试题8_二叉树的下一个节点;

public class Solution_Mine {
    public TreeLinkNode GetNext(TreeLinkNode pNode) {
        TreeLinkNode treeLinkNode = pNode;
        if (treeLinkNode.right != null) {
            treeLinkNode = treeLinkNode.right;
            while (treeLinkNode.left == null && treeLinkNode.right != null) {
                treeLinkNode = treeLinkNode.right;
            }
            while (treeLinkNode.left != null) {
                treeLinkNode = treeLinkNode.left;
            }
            return treeLinkNode;
        } else if (pNode.next.left == null) {
            return pNode.next;
        } else {
            while (pNode.next != null && pNode.next.left != pNode) {
                pNode = pNode.next;
            }
            return pNode;
        }
    }

    public static void main(String[] args) {
        TreeLinkNode treeLinkNode = new TreeLinkNode(8);
        treeLinkNode.left = new TreeLinkNode(6);
        treeLinkNode.right = new TreeLinkNode(10);
        treeLinkNode.left.next = treeLinkNode;
        treeLinkNode.right.next = treeLinkNode;
        treeLinkNode.left.left = new TreeLinkNode(5);
        treeLinkNode.left.right = new TreeLinkNode(7);
        treeLinkNode.left.left.next = treeLinkNode.left;
        treeLinkNode.left.right.next = treeLinkNode.left;
//        treeLinkNode.left.right.left = new TreeLinkNode(8);
//        treeLinkNode.left.right.right = new TreeLinkNode(9);
//        treeLinkNode.left.right.left.next = treeLinkNode.left.right;
//        treeLinkNode.left.right.right.next = treeLinkNode.left.right;
//        treeLinkNode.left.right.right.left = new TreeLinkNode(10);
//        treeLinkNode.left.right.right.left.next = treeLinkNode.left.right.right;
        treeLinkNode.right.left = new TreeLinkNode(9);
        treeLinkNode.right.right = new TreeLinkNode(11);
        treeLinkNode.right.left.next = treeLinkNode.right;
        treeLinkNode.right.right.next = treeLinkNode.right;
        Solution_Mine s = new Solution_Mine();
        System.out.println(s.GetNext(treeLinkNode.left.right).val);
    }
}

class TreeLinkNode {
    int val;
    TreeLinkNode left = null;
    TreeLinkNode right = null;
    TreeLinkNode next = null;

    TreeLinkNode(int val) {
        this.val = val;
    }
}
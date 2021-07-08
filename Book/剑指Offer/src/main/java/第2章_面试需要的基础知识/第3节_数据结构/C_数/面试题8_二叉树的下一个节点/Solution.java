package 第2章_面试需要的基础知识.第3节_数据结构.C_数.面试题8_二叉树的下一个节点;

public class Solution
{
    public TreeLinkNode GetNext(TreeLinkNode node)
    {
        if(node==null)return null;
        if(node.right!=null)
        {
            node=node.right;
            while(node.left!=null)
            {
                node=node.left;
               
            }return node;
        }
        while(node.next!=null)
        {
            if(node.next.left==node)return node.next;
            node=node.next;
        }
        return null;
    }
}
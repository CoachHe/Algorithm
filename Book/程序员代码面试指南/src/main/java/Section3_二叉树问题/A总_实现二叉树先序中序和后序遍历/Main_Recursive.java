package Section3_二叉树问题.A总_实现二叉树先序中序和后序遍历;


import Section3_二叉树问题.二叉树.TreeNode;

import java.util.Scanner;

public class Main_Recursive {
    public static void preOrderRecur(TreeNode head) {
        if (head == null) {
            return;
        }
        System.out.print(head.val + " ");
        preOrderRecur(head.left);
        preOrderRecur(head.right);
    }
    public static void inOrderRecur(TreeNode head) {
        if (head == null) {
            return;
        }
        inOrderRecur(head.left);
        System.out.print(head.val + " ");
        inOrderRecur(head.right);
    }
    public static void posOrderRecur(TreeNode head) {
        if (head == null) {
            return;
        }
        posOrderRecur(head.left);
        posOrderRecur(head.right);
        System.out.print(head.val + " ");
    }
    public static int[] getIntArray(String str){
        String[] temp=str.split(" ");
        int[] result=new int[temp.length];
        for(int i=0;i<temp.length;i++){
            result[i]=Integer.parseInt(temp[i]);//转换成整数
        }
        return result;
    }
    public static TreeNode createTreeNode(Scanner in){
        int[] nodes=getIntArray(in.nextLine());
        TreeNode node=new TreeNode();
        node.val=nodes[0];
        if(nodes[1]!=0){
            //左孩子
            node.left=createTreeNode(in);
        }
        if(nodes[2]!=0){
            //右孩子
            node.right=createTreeNode(in);
        }
        return node;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        if (in.hasNextLine()) {
            String str = in.nextLine();
        }
        StringBuilder sb =new StringBuilder();
        TreeNode treeNode = createTreeNode(in);
        preOrderRecur(treeNode);
        System.out.println();
        inOrderRecur(treeNode);
        System.out.println();
        posOrderRecur(treeNode);
    }

}


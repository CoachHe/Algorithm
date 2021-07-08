package Section3_二叉树问题.J_判断t1数是否包含t2数的全部拓扑结构;


import Section3_二叉树问题.二叉树.Node;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static boolean contains(Node head1, Node head2) {
        if (head2 == null) {
            return true;
        }
        if (head1 == null) {
            return false;
        }
        boolean res;
        if (head1.value == head2.value) {
            res = check(head1, head2);
        } else {
            return contains(head1.left, head2) || contains(head1.right, head2);
        }
        return res;
    }

    public static boolean check(Node t1, Node t2) {
        if (t2 == null) {
            return true;
        }
        if (t1 == null || t1.value != t2.value) {
            return false;
        }
        return check(t1.left, t2.left) && check(t1.right, t2.right);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] strings = br.readLine().split(" ");
        int n = Integer.parseInt(strings[0]);
        int root = Integer.parseInt(strings[1]);
        Node head1 = new Node(root);
        int[][] arr1 = new int[n + 1][2];
        for (int i = 0; i < n; i++) {
            strings = br.readLine().split(" ");
            arr1[Integer.parseInt(strings[0])][0] = Integer.parseInt(strings[1]);
            arr1[Integer.parseInt(strings[0])][1] = Integer.parseInt(strings[2]);
        }
        createTree(head1, arr1);
        strings = br.readLine().split(" ");
        int n2 = Integer.parseInt(strings[0]);
        root = Integer.parseInt(strings[1]);
        Node head2 = new Node(root);
        int[][] arr2 = new int[n + 1][2];
        for (int i = 0; i < n2; i++) {
            strings = br.readLine().split(" ");
            arr2[Integer.parseInt(strings[0])][0] = Integer.parseInt(strings[1]);
            arr2[Integer.parseInt(strings[0])][1] = Integer.parseInt(strings[2]);
        }
        createTree(head2, arr2);
        System.out.println(contains(head1, head2));
    }
//    public static void main(String[] args) throws IOException {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        String[] ss1 = reader.readLine().split(" ");
//        int n1 = Integer.parseInt(ss1[0]);
//        int r1 = Integer.parseInt(ss1[1]);
//        int[][] a = new int[n1 + 1][2];
//        int t;
//        for (int i = 0; i < n1; i++) {
//            String string = reader.readLine();
//            String[] sts = string.split(" ");
//            t = Integer.parseInt(sts[0]);
//            a[t][0] = Integer.parseInt(sts[1]);
//            a[t][1] = Integer.parseInt(sts[2]);
//        }
////        String[] ss2 = reader.readLine().split(" ");
////        int n2 = Integer.parseInt(ss2[0]);
////        int r2 = Integer.parseInt(ss2[1]);
////        int[][] b = new int[n1 + 1][2];
////        for (int i = 0; i < n2; i++) {
////            String string = reader.readLine();
////            String[] sts = string.split(" ");
////            t = Integer.parseInt(sts[0]);
////            b[t][0] = Integer.parseInt(sts[1]);
////            b[t][1] = Integer.parseInt(sts[2]);
////        }
//        Node tree1 = new Node(r1);
//        createTree(tree1, a);
////        Node tree2 = new Node(r2);
////        createTree(tree2, b);
////        System.out.println(contains(tree1, tree2));
//        System.out.println(tree1.value);
//        System.out.println(tree1.left.value);
//        System.out.println(tree1.right.value);
//        System.out.println(tree1.left.left.value);
//    }

    public static void createTree(Node head, int[][] arr) {
        if (head == null) {
            return;
        }
        if (arr[head.value][0] != 0) {
            head.left = new Node(arr[head.value][0]);
            createTree(head.left, arr);
        }
        if (arr[head.value][1] != 0) {
            head.right = new Node(arr[head.value][1]);
            createTree(head.right, arr);
        }
    }
}

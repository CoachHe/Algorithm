package Section3_二叉树问题.第589题_N叉数的前序遍历;


import Section3_二叉树问题.链表.Node;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    List<Integer> list = new ArrayList<>();
    public List<Integer> preorder(Node root) {
        if (root == null) {
            return null;
        }
        list.add(root.val);
        for (int i = 0; i < root.children.size(); i++) {
            preorder(root.children.get(i));
        }
        return list;
    }

    public static void main(String[] args) {

    }
}

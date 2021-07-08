package Section3_二叉树问题.第429题_二叉树的层序遍历;


import Section3_二叉树问题.链表.Node;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    List<List<Integer>> listList = new ArrayList<>();
    List<Integer> list = new ArrayList<>();
    List<Node> l_node = new ArrayList<>();
    public List<List<Integer>> levelOrder(Node root) {
        if (root == null) {
            return listList;
        }
        list.add(root.val);
        listList.add(list);
        if (root.children == null || root.children.size() == 0) {
            return listList;
        }
        l_node = level_Node(root);
        list = level_Integer(l_node);
        listList.add(list);
        list = new ArrayList<>();
        while (l_node.size() != 0) {
            l_node = level_Node(l_node);
            list = level_Integer(l_node);
            if (list.size() != 0) {
                listList.add(list);
            }
        }
        return listList;
    }

    public List<Integer> level_Integer(List<Node> l) {
        list = new ArrayList<>();
        if (l == null) {
            return list;
        }
        for (Node node : l) {
            list.add(node.val);
        }
        return list;
    }

    public List<Node> level_Node(Node root) {
        if (root == null || root.children == null) {
            return l_node;
        }
        l_node.addAll(root.children);
        return l_node;
    }
    public List<Node> level_Node(List<Node> l) {
        l_node = new ArrayList<>();
        if (l == null) {
            return null;
        }
        for (Node tmp : l) {
            if (tmp.children != null) {
                l_node.addAll(tmp.children);
            }
        }
        return l_node;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        Node root = new Node(44);
        List<Node> list = new ArrayList<>();
        root.children = list;
//        List<List<Integer>> l = s.levelOrder(root);
        System.out.println(s.levelOrder(root));
    }
}

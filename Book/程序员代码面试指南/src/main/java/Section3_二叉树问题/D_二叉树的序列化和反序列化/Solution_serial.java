package Section3_二叉树问题.D_二叉树的序列化和反序列化;


import Section3_二叉树问题.二叉树.Node;

public class Solution_serial {
    public String serialByPre(Node head) {
        if (head == null) {
            return "#!";
        }
        String res = head.value + "!";
        res += serialByPre(head.left);
        res += serialByPre(head.right);
        return res;
    }
}

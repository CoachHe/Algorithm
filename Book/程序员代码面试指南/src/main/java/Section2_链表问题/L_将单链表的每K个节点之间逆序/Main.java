package Section2_链表问题.L_将单链表的每K个节点之间逆序;


import Section2_链表问题.Node.Node;

public class Main {
    public static Node reverseKnode(Node head) {
        Node pre = head;
        Node next;
        int k = 0;
        while (head.next != null) {
            next = head.next;
            head = next;
        }

        return null;
    }
}

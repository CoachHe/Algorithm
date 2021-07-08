package Section2_链表问题.D_反转单向和双向链表;
public class Solution {
    public Node reverseList(Node head) {
        Node pre = null;
        Node next = null;
        while (head != null) {
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;
    }
}

class Node {
    public int value;
    public Node next;

    public Node(int data) {
        this.value = data;
    }
}

package Section2_链表问题.C_删除链表的中间节点和a比b处的节点;

public class Solution_original {
    public Node removeMidNode(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        if (head.next.next == null) {
            return head.next;
        }
        Node pre = head;
        Node cur = head.next.next;
        while (cur.next != null && cur.next.next != null) {
            pre = pre.next;
            cur = cur.next.next;
        }
        pre.next = pre.next.next;
        return head;
    }
}

class Node{
    public int value;
    public Node next;

    public Node(int data) {
        this.value = data;
    }
}

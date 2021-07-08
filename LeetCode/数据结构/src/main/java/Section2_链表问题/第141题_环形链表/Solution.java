package Section2_链表问题.第141题_环形链表;

public class Solution  {
    public static boolean hasCycle(Node head) {
        if (head == null || head.next == null) {
            return false;
        }
        Node secondNode = head.next;
        while (head != secondNode) {
            if (head == null || secondNode == null || head.next == null|| secondNode.next.next == null) {
                return false;
            }
            head = head.next;
            secondNode = secondNode.next.next;
        }
        return true;
    }

    public static void main(String[] args) {
        Node head = new Node(0);
        System.out.println(hasCycle(head));
    }
}

class Node{
    public int value;
    public Node next;

    public Node(int value) {
        this.value = value;
    }
}


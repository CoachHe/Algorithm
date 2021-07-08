package Section2_链表问题.B_在单链表和双链表中删除倒数第K个数.问题;

public class Solution {
    public Node removeLastKth(Node head, int lastKth) {
        if (head == null || lastKth < 1) {
            return head;
        }
        Node cur = head;
        while (cur != null) {
            lastKth--;
            cur = cur.next;
        }
        if (lastKth == 0) {
            head = head.next;
        }
        if (lastKth < 0) {
            cur = head;
            while (++lastKth != 0) {
                cur = cur.next;
            }
            cur.next = cur.next.next;
        }
        return head;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        Solution s = new Solution();
        s.removeLastKth(head, 4);
        while (head != null) {
            System.out.print(head.value + " ");
            head = head.next;
        }
    }
}

class Node {
    public int value;
    public Node next;

    public Node(int data) {
        this.value = data;
    }
}

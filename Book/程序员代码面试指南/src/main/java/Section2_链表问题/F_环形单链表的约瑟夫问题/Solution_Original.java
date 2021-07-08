package Section2_链表问题.F_环形单链表的约瑟夫问题;

public class Solution_Original {
    public Node josephusKill1(Node head, int m) {
        if (head == null || head.next == head || m < 1) {
            return head;
        }
        Node last = head;
        while (last.next != head) {
            last = last.next;
        }
        int count = 0;
        while (head != last) {
            if (++count == m) {
                last.next = head.next;
                count = 0;
            } else {
                last = last.next;
            }
            head = last.next;
        }
        return head;
    }
    public static void main(String[] args) {
        Node head = new Node(1);
        Node cur = head;
        for (int i = 2; i <= 31; i++) {
            cur.next = new Node(i);
            cur = cur.next;
        }
        cur.next = head;
        Solution_Original s = new Solution_Original();
        Node so = s.josephusKill1(head, 3);
        System.out.println(so.value);
    }
}

class Node {
    public Node next;
    public int value;

    public Node(int value) {
        this.value = value;
    }
}

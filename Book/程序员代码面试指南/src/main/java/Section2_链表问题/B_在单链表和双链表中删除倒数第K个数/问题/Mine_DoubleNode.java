package Section2_链表问题.B_在单链表和双链表中删除倒数第K个数.问题;

public class Mine_DoubleNode {
    public static MyDoubleNode removeNthFromEnd(MyDoubleNode head, int N) {
        if (head == null || N < 1) {
            System.out.println("Invalid");
            return head;
        }
        MyDoubleNode cur = head;
        while (cur != null) {
            cur = cur.next;
            N--;
        }
        if (N == 0) {
            cur = cur.next;
            cur.last = null;
        } else if (N > 0) {
            System.out.println("N is larger than the length of the list");
            return head;
        } else {
            cur = head;
            while (++N != 0) {
                cur = cur.next;
            }
            cur.next = cur.next.next;
            cur.next.last = cur;
        }
        return head;
    }

    public static void main(String[] args) {
        MyDoubleNode head = new MyDoubleNode(1);
        head.next = new MyDoubleNode(2);
        head.last = null;
        head.next.last = head;
        head.next.next = new MyDoubleNode(3);
        head.next.next.last = head.next;
        head.next.next.next = new MyDoubleNode(4);
        head.next.next.next.last = head.next.next;
        removeNthFromEnd(head, 2);
        while (head != null) {
            System.out.print(head.value + " ");
            head = head.next;
        }
    }
}

class MyDoubleNode {
    MyDoubleNode next;
    MyDoubleNode last;
    int value;

    public MyDoubleNode(int value) {
        this.value = value;
    }
}



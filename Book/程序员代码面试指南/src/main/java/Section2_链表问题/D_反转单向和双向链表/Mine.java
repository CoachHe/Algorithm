package Section2_链表问题.D_反转单向和双向链表;

public class Mine {
    public static MyNode reverseNode(MyNode head) {
        MyNode pre = null;
        MyNode next = null;
        while (head != null) {
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;
    }

    public static void main(String[] args) {
        MyNode head = new MyNode(1);
        head.next = new MyNode(2);
        head.next.next = new MyNode(3);
        head.next.next.next = new MyNode(4);
        head.next.next.next.next = new MyNode(5);
        reverseNode(head);
        MyNode a = head;
        while (a != null) {
            System.out.print(a.value + " ");
            a = a.next;
        }
    }
}

class MyNode {
    public int value;
    public MyNode next;

    public MyNode(int value) {
        this.value = value;
    }
}

package Section2_链表问题.D_反转单向和双向链表;

public class Mine_Advanced {
    public static MyDoubleNode reverseNode(MyDoubleNode head) {
        MyDoubleNode pre = null;
        MyDoubleNode next = null;
        while (head != null) {
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;
    }
}

class MyDoubleNode{
    public int value;
    public MyDoubleNode last;
    public MyDoubleNode next;

    public MyDoubleNode(int data) {
        this.value = data;
    }
}

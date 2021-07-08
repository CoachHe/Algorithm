package Section2_链表问题.C_删除链表的中间节点和a比b处的节点;

public class Mine_original {
    public static MyNode removeMid(MyNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        if (head.next.next == null) {
            return head.next;
        }
        MyNode cur = head.next.next;
        MyNode pre = head;
        while (cur.next != null && cur.next.next != null) {
            pre = pre.next;
            cur = cur.next.next;
        }
        pre.next = pre.next.next;
        return head;
    }

    public static void main(String[] args) {
        MyNode head = new MyNode(1);
        head.next = new MyNode(2);
        head.next.next = new MyNode(3);
        head.next.next.next = new MyNode(4);
        head.next.next.next.next = new MyNode(5);
        removeMid(head);
        MyNode a = head;
        while (a != null) {
            System.out.print(a.value + " ");
            a = a.next;
        }
    }
}

class MyNode{
    MyNode next;
    int value;

    public MyNode(int value) {
        this.value = value;
    }
}

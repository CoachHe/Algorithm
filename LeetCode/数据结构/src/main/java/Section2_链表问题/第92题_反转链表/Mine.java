package Section2_链表问题.第92题_反转链表;


class MyListNode {
    int val;
    MyListNode next;
    MyListNode(int x) { val = x; }
}

public class Mine {
    public static MyListNode reverseBetween(MyListNode head, int m, int n) {
        MyListNode cur = head;
        MyListNode preNode = null;
        MyListNode afterNode = null;
        int len = 0;
        while (cur != null) {
            len++;
            preNode = len == m - 1 ? cur : preNode;
            afterNode = len == n + 1 ? cur : afterNode;
            cur = cur.next;
        }
        MyListNode endNode = preNode.next;
        MyListNode next = null;
        MyListNode pre = null;
        cur = preNode.next;
        while (cur != afterNode) {
            next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        preNode.next = pre;
        endNode.next = afterNode;
        return head;
    }

    public static void main(String[] args) {
        MyListNode head = new MyListNode(1);
        head.next = new MyListNode(2);
        head.next.next = new MyListNode(3);
        head.next.next.next = new MyListNode(4);
        head.next.next.next.next = new MyListNode(5);
        reverseBetween(head, 2, 4);
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
    }
}


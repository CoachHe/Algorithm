package Section2_链表问题.E_反转部分单向链表;

public class Mine {
    public MyNode reversePart(MyNode head, int from, int to) {
        MyNode node1 = head;
        MyNode beforeNode = null;
        MyNode afterNode = null;
        int len = 0;
        while (node1 != null) {
            len++;
            beforeNode = from - 1 == len ? node1 : beforeNode;
            afterNode = to + 1 ==len ? node1 : afterNode;
            node1 = node1.next;
        }
        node1 = beforeNode == null ? head : beforeNode.next;
        MyNode node2 = node1.next;
        MyNode next = null;
        while (from != to) {
            next = node2.next;
            node2.next = node1;
            node1 = node2;
            node2 = next;
        }
        if (beforeNode != null) {
            beforeNode.next = node1;
            return head;
        }
        return node1;
    }
}
class MyNode{
    public int value;
    public MyNode next;

    public MyNode(int value) {
        this.value = value;
    }
}

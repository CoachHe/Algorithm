package Section2_链表问题.F_环形单链表的约瑟夫问题;

public class Mine_Original {
    public static MyNode josephusKill1(MyNode head, int m) {
        int count = 1;
        if (head == null || head.next == null || m < 1) {
            return head;
        }
        MyNode pre = head;
        while (pre.next != head) {
            pre = pre.next;
        }
        while (head != pre) {
            if (count == m) {
                pre.next = head.next;
                count = 0;
            } else {
                pre = pre.next;
            }
            head = head.next;
            count++;
        }
        return head;
    }

    public static void main(String[] args) {
        MyNode head = new MyNode(1);
        MyNode cur = head;
        for (int i = 2; i <= 31; i++) {
            cur.next = new MyNode(i);
            cur = cur.next;
        }
        cur.next = head;
        MyNode s = josephusKill1(head, 3);
        System.out.println(s.value);
    }
}

class MyNode{
    public MyNode next;
    public int value;

    public MyNode(int value) {
        this.value = value;
    }
}
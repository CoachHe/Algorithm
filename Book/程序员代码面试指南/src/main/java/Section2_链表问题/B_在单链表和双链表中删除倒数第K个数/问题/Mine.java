package Section2_链表问题.B_在单链表和双链表中删除倒数第K个数.问题;

public class Mine {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null || n < 1) {
            System.out.println("Invalid");
            return head;
        }
        ListNode cur = head;
        int tmp = n;
        while (cur != null) {
            cur = cur.next;
            tmp--;
        }
        if (tmp > 0) {
            System.out.println("The value of n is larger than the size of the List");
            return head;
        } else if (tmp == 0) {
            head = head.next;
        }else {
            cur = head;
            while (++tmp != 0) {
                cur = cur.next;
            }
            cur.next = cur.next.next;
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        Mine m = new Mine();
        m.removeNthFromEnd(head, 4);

        while (head != null) {
            System.out.print(head.value + " ");
            head = head.next;
        }
    }
}

class ListNode{
    int value;
    ListNode next;

    public ListNode(int value) {
        this.value = value;
    }
}

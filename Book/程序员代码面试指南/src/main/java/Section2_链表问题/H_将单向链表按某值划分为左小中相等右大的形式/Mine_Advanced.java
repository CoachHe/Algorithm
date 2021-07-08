package Section2_链表问题.H_将单向链表按某值划分为左小中相等右大的形式;


import Section2_链表问题.Node.Node;

public class Mine_Advanced {
    public static Node listPartition1(Node head, int pivot) {
        Node smallHead = null;
        Node smallEnd = null;
        Node equalHead = null;
        Node equalEnd = null;
        Node bigHead = null;
        Node bigEnd = null;
        Node next = null;
        if (head == null || head.next == null) {
            return head;
        }
        while (head != null) {
            next = head.next;
            if (head.value < pivot) {
                if (smallHead == null) {
                    smallHead = head;
                    smallEnd = head;
                } else if (smallEnd == null) {
                    smallEnd = head;
                    smallHead.next = smallEnd;
                } else {
                    smallEnd.next = head;
                    smallEnd = head;
                    head.next = null;
                }
            } else if (head.value == pivot) {
                if (equalHead == null) {
                    equalHead = head;
                    equalEnd = head;
                } else if (equalEnd == null) {
                    equalEnd = head;
                    equalHead.next = equalEnd;
                } else {
                    equalEnd.next = head;
                    equalEnd = head;
                    head.next = null;
                }
            } else {
                if (bigHead == null) {
                    bigHead = head;
                    bigEnd = head;
                } else if (bigEnd == null) {
                    bigEnd = head;
                    bigHead.next = bigEnd;
                } else {
                    bigEnd.next = head;
                    bigEnd = head;
                    head.next = null;
                }
            }
            head = next;
        }
        if (smallHead != null) {
            smallEnd.next = equalHead;
        }
        if (equalHead != null) {
            equalHead.next = bigHead;
        }
        return smallHead != null ? smallHead : equalHead != null ? equalHead : bigEnd;
    }

    public static void main(String[] args) {
        Node head = new Node(9);
        head.next = new Node(0);
        head.next.next = new Node(4);
        head.next.next.next = new Node(5);
        head.next.next.next.next = new Node(1);
        Node head2 = listPartition1(head, 4);
        while (head2 != null) {
            System.out.print(head2.value + " ");
            head2 = head2.next;
        }
    }
}

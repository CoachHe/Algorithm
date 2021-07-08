package Section2_链表问题.H_将单向链表按某值划分为左小中相等右大的形式;


import Section2_链表问题.Node.Node;

public class Solution_Advanced {
    public static Node listPartition2(Node head, int pivot) {
        Node sH = null;     //小的头
        Node sT = null;     //小的尾
        Node eH = null;     //相等的头
        Node eT = null;     //相等的尾
        Node bH = null;     //大的头
        Node bT = null;     //大的尾
        Node next = null;   //保存下一个节点
        //所有的节点放进三个链表中
        while (head != null) {
            next = head.next;
            head.next = null;
            if (head.value < pivot) {
                if (sH == null) {
                    sH = head;
                    sT = head;
                } else {
                    sT.next = head;
                    sT = head;
                }
            } else if (head.value == pivot) {
                if (eH == null) {
                    eH = head;
                    eT = head;
                } else{
                    eT.next = head;
                    eT = head;
                }
            } else {
                if (bH == null) {
                    bH = head;
                    bT = head;
                }
            }
            head = next;
        }
        // 小的和相等的重新连接
        if (sT != null) {
            sT.next = eH;
            eT = eT == null ? sT : eT;
        }
        // 所有的重新连接
        if (eT != null) {
            eT.next = bH;
        }
        return sH != null ? sH : eH != null ? eH : bH;
    }
    public static void main(String[] args) {
        Node head = new Node(9);
        head.next = new Node(0);
        head.next.next = new Node(4);
        head.next.next.next = new Node(5);
        head.next.next.next.next = new Node(1);
        Node head2 = listPartition2(head, 3);
        while (head2 != null) {
            System.out.print(head2.value + " ");
            head2 = head2.next;
        }
    }
}

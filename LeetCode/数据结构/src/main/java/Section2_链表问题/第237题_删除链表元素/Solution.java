package Section2_链表问题.第237题_删除链表元素;


class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

public class Solution {
    public static void deleteNode(ListNode node) {
//        node.val = node.next.val;
//        node.next = node.next.next;
        node = node.next;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);
        deleteNode(head.next.next.next);
        ListNode a = head;
        while (a != null) {
            System.out.print(a.val + " ");
            a = a.next;
        }
    }
}


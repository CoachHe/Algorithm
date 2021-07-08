package 第3章_高质量的代码.第4节_代码的鲁棒性.面试题23_链表中环的入口节点;

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}

public class Solution {

    public ListNode EntryNodeOfLoop(ListNode pHead)
    {
        ListNode l1 = pHead;
        ListNode l2 = pHead.next;
        while (l1 != l2) {
            if (l1 == null || l2 == null) {
                return null;
            }
            l1 = l1.next;
            l2 = l2.next.next;
        }
        int length = 1;
        l1 = l1.next;
        while (l1 != l2) {
            length++;
            l1 = l1.next;
        }
        l1 = pHead;
        l2 = pHead;
        while (length != 0) {
            length--;
            l2 = l2.next;
        }
        while (l1 != l2) {
            l1 = l1.next;
            l2 = l2.next;
        }
        return l1;
    }

    public static void main(String[] args) {
        ListNode pHead = new ListNode(1);
        pHead.next = new ListNode(2);
        pHead.next.next = new ListNode(3);
        pHead.next.next.next = new ListNode(4);
        pHead.next.next.next.next = new ListNode(5);
        pHead.next.next.next.next.next = new ListNode(6);
        pHead.next.next.next.next.next.next = pHead.next.next;
        Solution s = new Solution();
        System.out.println(s.EntryNodeOfLoop(pHead).val);
    }
}
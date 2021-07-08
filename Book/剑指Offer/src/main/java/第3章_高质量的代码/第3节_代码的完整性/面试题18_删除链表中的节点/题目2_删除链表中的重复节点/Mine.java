package 第3章_高质量的代码.第3节_代码的完整性.面试题18_删除链表中的节点.题目2_删除链表中的重复节点;

public class Mine {
    public ListNode deleteDuplication(ListNode pHead){
        ListNode pre = new ListNode(0);
        pre.next = pHead;
        boolean MoreThanOne = false;
        ListNode root = pHead;
        ListNode beforeNode = pHead;
        while (pHead != null) {
            int tmpValue = pHead.val;
            pHead = pHead.next;
            if (pHead == null) {
                return root;
            }
            if (pHead.val == tmpValue) {
                pre.next = pHead;
            } else {
                if (pHead.next == null) {
                    return root;
                } else if (pHead.next.val == pHead.val) {
                    int value = pHead.val;
                    while (pHead != null && pHead.val == value) {
                        pHead = pHead.next;
                    }
                    if (!MoreThanOne) {
                        pre.next = beforeNode;
                        pre = pre.next;
                        MoreThanOne = false;
                    } else {
                        MoreThanOne = true;
                    }
                } else {
                    pre.next = beforeNode;
                    pre = pre.next;
                    MoreThanOne = false;
                }

                beforeNode.next = pHead;
                beforeNode = beforeNode.next;
            }
        }

        return root;
    }

    public static void main(String[] args) {
        Mine s = new Mine();
        ListNode pHead = new ListNode(1);
        pHead.next = new ListNode(2);
        pHead.next.next = new ListNode(3);
        pHead.next.next.next = new ListNode(3);
        pHead.next.next.next.next = new ListNode(4);
        pHead.next.next.next.next.next = new ListNode(4);
        pHead.next.next.next.next.next.next = new ListNode(5);
        s.deleteDuplication(pHead);
        while (pHead != null) {
            System.out.print(pHead.val + " ");
            pHead = pHead.next;
        }
    }
}

package Section2_链表问题.第92题_反转链表;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}


public class Solution {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode cur = head;
        ListNode preNode = null;
        ListNode afterNode = null;
        int len = 0;
        while (cur != null) {
            len++;
            preNode = len == m - 1 ? cur : preNode;
            afterNode = len == n + 1 ? cur : afterNode;
            cur = cur.next;
        }
        if(m >= n || m < 1 || n > len || len == 1){ return head; }
        ListNode endNode = preNode == null ? head : preNode.next;
        ListNode next = null;
        ListNode pre = null;
        cur = preNode == null ? head : preNode.next;
        while (cur != afterNode) {
            next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        if (afterNode == null && preNode == null) {
            return pre;
        }
        endNode.next = afterNode;
        if(preNode != null){
            preNode.next = pre;
            return head;
        }
        System.out.println("pre=" + pre.val);
        return pre;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(3);
        head.next = new ListNode(5);
//        head.next.next = new ListNode(3);
        Solution s = new Solution();
        ListNode t = s.reverseBetween(head, 1, 2);
        while (t != null) {
            System.out.print(t.val + " ");
            t = t.next;
        }
    }
}


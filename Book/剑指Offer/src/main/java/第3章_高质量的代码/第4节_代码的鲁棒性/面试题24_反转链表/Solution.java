package 第3章_高质量的代码.第4节_代码的鲁棒性.面试题24_反转链表;

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
public class Solution {
    public ListNode ReverseList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode root = head;
        ListNode before = head;
        head = head.next;
        root.next = null;
        while(head != null){
            before = head;
            head = head.next;
            before.next = root;
            root = before;
        }
        return before;
    }
}
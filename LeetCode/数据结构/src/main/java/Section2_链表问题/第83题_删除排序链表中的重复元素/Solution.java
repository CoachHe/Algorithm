package Section2_链表问题.第83题_删除排序链表中的重复元素;


import Section2_链表问题.链表.ListNode;

public class Solution {
    public ListNode deleteDuplicated(ListNode head) {
        ListNode res = head;
        while (head != null) {
            if (head.next != null && head.val == head.next.val) {
                head.next = head.next.next;
            }else {
                head = head.next;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(1);
//        head.next.next.next = new ListNode(3);
//        head.next.next.next.next = new ListNode(3);
        ListNode res = s.deleteDuplicated(head);
        while (res != null) {
            System.out.print(res.val + " ");
            res = res.next;
        }
    }
}

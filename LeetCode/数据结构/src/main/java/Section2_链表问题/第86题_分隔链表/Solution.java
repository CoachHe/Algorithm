package Section2_链表问题.第86题_分隔链表;


import Section2_链表问题.链表.ListNode;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode small = null;
        ListNode large = null;
        ListNode res = head;
        ListNode res2 = null;
        ListNode res3 = null;
        int jud = 0;
        int jud2 = 0;
        while (head != null) {
            if (head.val < x && jud == 0) {
                small = new ListNode(head.val);
                res3 = small;
                small = small.next;
                res3.next = small;
                jud++;
            } else if (head.val < x && jud != 0) {
                small = new ListNode(head.val);
                small = small.next;
            } else if (head.val >= x && jud2 == 0) {
                large = new ListNode(head.val);
                res2 = large;
                large = large.next;
                res2.next = large;
                jud2++;
            } else {
                large = new ListNode(head.val);
                large = large.next;
            }
            head = head.next;
        }
        if (small == null || large == null) {
            return res;
        }
        small = res2;
        return res3;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(4);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(2);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(2);
        Solution s = new Solution();
        ListNode res = s.partition(head, 3);
        while (res != null) {
            System.out.print(res.val + " ");
            res = res.next;
        }

    }
}

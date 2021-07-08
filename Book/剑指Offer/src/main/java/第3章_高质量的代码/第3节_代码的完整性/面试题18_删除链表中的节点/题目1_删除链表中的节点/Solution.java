package 第3章_高质量的代码.第3节_代码的完整性.面试题18_删除链表中的节点.题目1_删除链表中的节点;


import java.util.Arrays;

//Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

class Solution {
    public ListNode deleteNode(ListNode head, int val) {
        if (head == null) {
            return null;
        }
        ListNode root = head;
        ListNode before = head;
        if (root.val == val) {
            return root.next;
        }
        while (head != null) {
            head = head.next;
            if (head != null && head.val == val) {
                break;
            }
            before = head;
        }
        if (head == root) {
            return root.next;
        }
        if (head == null) {
            return root;
        }
        before.next = head.next;
        return root;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        ListNode root = new ListNode(-3);
        root.next = new ListNode(5);
        root.next.next = new ListNode(-99);
//        root.next.next.next = new ListNode(9);
        ListNode head = s.deleteNode(root, -3);
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }

    }
}
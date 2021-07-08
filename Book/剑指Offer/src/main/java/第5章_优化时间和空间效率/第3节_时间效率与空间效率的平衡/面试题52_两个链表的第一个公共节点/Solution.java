package 第5章_优化时间和空间效率.第3节_时间效率与空间效率的平衡.面试题52_两个链表的第一个公共节点;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}

public class Solution {
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        Stack<ListNode> queue1 = new Stack<>();
        Stack<ListNode> queue2 = new Stack<>();
        while (pHead1 != null) {
            queue1.add(pHead1);
            pHead1 = pHead1.next;
        }
        while (pHead2 != null) {
            queue2.add(pHead2);
            pHead2 = pHead2.next;
        }
        ListNode res = null;
        while (queue1.size() != 0 && queue2.size() != 0 &&
                queue1.peek() == queue2.peek()) {
            queue1.pop();
            res = queue2.pop();
        }
        return res;
    }

    public static void main(String[] args) {
        ListNode root1 = new ListNode(1);
        root1.next = new ListNode(2);
        root1.next.next = new ListNode(3);
        root1.next.next.next = new ListNode(6);
        root1.next.next.next.next = new ListNode(7);
        ListNode root2 = new ListNode(4);
        root2.next = new ListNode(5);
        root2.next.next = root1.next.next.next;
        Solution s = new Solution();
        ListNode res = s.FindFirstCommonNode(root1, root2);
        System.out.println(res.val);
    }
}
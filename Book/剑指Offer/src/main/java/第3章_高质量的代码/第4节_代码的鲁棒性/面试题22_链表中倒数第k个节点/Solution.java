package 第3章_高质量的代码.第4节_代码的鲁棒性.面试题22_链表中倒数第k个节点;

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
public class Solution {
    public ListNode FindKthToTail(ListNode head,int k) {
        if(head == null){
            return head;
        }
        ListNode root = head;
        int length = 0;
        while(head != null){
            length++;
            head = head.next;
        }
        if(k > length || k <= 0){
            return null;
        }
        int hel = 0;
        while(hel != length - k){
            hel++;
            root = root.next;
        }
        return root;
    }
}
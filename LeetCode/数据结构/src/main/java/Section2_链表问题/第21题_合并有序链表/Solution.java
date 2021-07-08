package Section2_链表问题.第21题_合并有序链表;


public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        } else if (l2 == null) {
            return l1;
        } else if (l1.val < l2.val) {
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        } else {  //这里其实就是l1.val>=l2.val
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }

    }

    public static void main(String[] args) {
        Solution a = new Solution();
        ListNode l1 = new ListNode(1);
        System.out.println(l1.next);
        ListNode l2 = new ListNode(1);
        System.out.println(a.mergeTwoLists(l1,l2));




    }
}

class ListNode {
    int val;
    ListNode next;    // 下一个链表对象
    ListNode(int x) { //赋值链表的值
        val = x;
    }
}



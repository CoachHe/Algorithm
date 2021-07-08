package Section2_链表问题.第86题_分隔链表;


import Section2_链表问题.链表.ListNode;

public class Solution2 {

    public ListNode partition(ListNode head, int x) {
        ListNode small = new ListNode(0);
        ListNode large = new ListNode(0);
        ListNode res = small;
        while (head != null) {
            if (head.val < x) {
                
            }
        }

        return null;
    }


    public static void main(String[] args) {
        ListNode list = new ListNode(1);
        ListNode head = list;
        list = list.next;
        System.out.println(head.val);
    }
}

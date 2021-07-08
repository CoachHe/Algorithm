package Section2_链表问题.第21题_合并有序链表;


class Solution7_16 {
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode listNode = null;
        ListNode res = null;
        for (ListNode tmp : lists){
            listNode = mergeTwoLists(listNode, tmp);
        }
        return listNode;
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2){
        ListNode list;
        if (l1 == null && l2 == null){
            return null;
        } else if (l1 == null){
            return l2;
        } else if (l2 == null){
            return l1;
        } else {
            if (l1.val > l2.val){
                list = new ListNode(l2.val);
                l2 = l2.next;
            } else {
                list = new ListNode(l1.val);
                l1 = l1.next;
            }
        }
        ListNode tmplist = list;
        while (l1 != null || l2 != null){
            if (l1 == null){
                list.next = new ListNode(l2.val);
                list = list.next;
                l2 = l2.next;
            } else if (l2 == null){
                list.next = new ListNode(l1.val);
                list = list.next;
                l1 = l1.next;
            } else if (l1.val > l2.val){
                list.next = new ListNode(l2.val);
                list = list.next;
                l2 = l2.next;
            } else {
                list.next = new ListNode(l1.val);
                list = list.next;
                l1 = l1.next;
            }
        }
        return tmplist;
    }

    public ListNode mergeTwo(ListNode[] listNodes){
        return null;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(5);
        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);
        ListNode l3 = new ListNode(2);
        l3.next = new ListNode(6);
        ListNode[] listNodes = new ListNode[]{l1, l2, l3};
        Solution7_16 solution7_16 = new Solution7_16();
        ListNode res = solution7_16.mergeKLists(listNodes);
        while (res != null){
            System.out.print(res.val + " ");
            res = res.next;
        }
    }
}
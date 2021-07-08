package 第3章_高质量的代码.第4节_代码的鲁棒性.面试题25_合并两个排序链表;


class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
public class Solution {
    public ListNode Merge(ListNode list1,ListNode list2) {
        if(list1 == null){
            return list2;
        }
        if(list2 == null){
            return list1;
        }
        ListNode res;
        ListNode root;
        if(list1.val < list2.val){
            res = new ListNode(list1.val);
            list1 = list1.next;
        } else{
            res = new ListNode(list2.val);
            list2 = list2.next;
        }
        root = res;
        while(list1 != null || list2 != null){
            int i1 = list1 == null ? Integer.MAX_VALUE : list1.val;
            int i2 = list2 == null ? Integer.MAX_VALUE : list2.val;
            if(i1 < i2){
                res.next = list1;
                list1 = list1.next;
            } else{
                res.next = list2;
                list2 = list2.next;
            }
            res = res.next;
        }
        return root;
    }
}
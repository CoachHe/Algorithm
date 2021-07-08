package 第2章_面试需要的基础知识.第3节_数据结构.B_字符串.面试题6_从尾到头打印链表;

import java.util.ArrayList;
import java.util.Stack;

public class Solution {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        Stack<Integer> stack = new Stack<>();
        ArrayList<Integer> arrayList = new ArrayList<>();
        if(listNode == null){
            return arrayList;
        }
        while (listNode != null) {
            stack.push(listNode.value);
            listNode = listNode.next;
        }
        while (!stack.isEmpty()) {
            arrayList.add(stack.pop());
        }
        return arrayList;
    }

    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(3);
        listNode.next.next.next = new ListNode(4);
        Solution s = new Solution();
        System.out.println(s.printListFromTailToHead(listNode));
    }
}

class ListNode{
    int value;
    ListNode next;
    ListNode(int value) {
        this.value = value;
    }
}

package Section2_链表问题.G_判断一个链表是否为回文结构;


import Section2_链表问题.Node.MyNode;

public class Mine_Original {
    public static boolean isPalindrome(MyNode head) {
        if (head == null || head.next == null) {
            return true;
        }
        MyNode beforeNode = head;
        MyNode afterNode = head;
        while (afterNode.next != null && afterNode.next.next != null) {
            beforeNode = beforeNode.next;
            afterNode = afterNode.next.next;
        }
        MyNode midNode = beforeNode;
        afterNode = midNode.next;
        midNode.next = null;
        MyNode tmpNode = null;
        MyNode next = null;
        while (afterNode != null) {
            next = afterNode.next;
            afterNode.next = tmpNode;
            tmpNode = afterNode;
            afterNode = next;
        }
        boolean ispalidrome = true;
        MyNode finalNode = tmpNode;
        while (head != null && tmpNode != null) {
            if (head.value != tmpNode.value) {
                ispalidrome = false;
                break;
            }
            head = head.next;
            tmpNode = tmpNode.next;
        }
        tmpNode = null;
        while (finalNode != null) {
            next = finalNode.next;
            finalNode.next = tmpNode;
            tmpNode = finalNode;
            finalNode = next;
        }
        midNode.next = tmpNode;
        return ispalidrome;
    }

    public static void main(String[] args) {
        MyNode head = new MyNode(1);
        head.next = new MyNode(2);
//        head.next.next = new MyNode(3);
//        head.next.next = new MyNode(2);
//        head.next.next.next = new MyNode(1);
        System.out.println(isPalindrome(head));
        while (head != null) {
            System.out.print(head.value + " ");
            head = head.next;
        }
    }
}

package Section2_链表问题.A_打印两个链表的公共部分;

public class Mine {
    public static void printCommonPart(MyNode head1, MyNode head2) {
        if (head1 == null || head2 == null) {
            return;
        }
        System.out.print("The common part is: ");
        while (head1 != null && head2 != null) {
            if (head1.value < head2.value) {
                head1 = head1.next;
            } else if (head1.value > head2.value) {
                head2 = head2.next;
            } else {
                System.out.print(head1.value + " ");
                head1 = head1.next;
                head2 = head2.next;
            }
        }
    }

    public static void main(String[] args) {
        MyNode head1 = new MyNode(1);
        head1.next = new MyNode(2);
        head1.next.next = new MyNode(3);
        head1.next.next.next = new MyNode(4);
        MyNode head2 = new MyNode(1);
        head2.next = new MyNode(2);
        head2.next.next = new MyNode(4);
        printCommonPart(head1, head2);
    }

}

class MyNode {
    MyNode next;
    int value;
    public MyNode(int value) {
        this.value = value;
    }
}

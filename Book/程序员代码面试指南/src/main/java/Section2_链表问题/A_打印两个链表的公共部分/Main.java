package Section2_链表问题.A_打印两个链表的公共部分;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void printPublic(Node head1, Node head2) {
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

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] strings = br.readLine().split(" ");
        Node head1 = new Node(Integer.parseInt(strings[0]));
        Node pre = head1;
        for (int i = 1; i < n; i++) {
            head1.next = new Node(Integer.parseInt(strings[i]));
            head1 = head1.next;
        }
        int m = Integer.parseInt(br.readLine());
        strings = br.readLine().split(" ");
        Node head2 = new Node(Integer.parseInt(strings[0]));
        Node pre2 = head2;
        for (int i = 1; i < m; i++) {
            head2.next = new Node(Integer.parseInt(strings[i]));
            head2 = head2.next;
        }
        printPublic(pre, pre2);
    }


}
class Node{
    int value;
    Node next;
    public Node(int value) {
        this.value = value;
    }

}

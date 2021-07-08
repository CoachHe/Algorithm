package Section2_链表问题.D_反转单向和双向链表;

import java.io.*;
public class Main{
    public static Node reverseNode(Node head){
        if(head == null || head.next == null){ return head; }
        Node pre = null;
        Node next = head.next;
        while(head != null){
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] strings = br.readLine().split(" ");
        Node head1 = new Node(Integer.parseInt(strings[0]));
        Node pre1 = head1;
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
        Node res = reverseNode(pre1);
        while (res != null) {
            System.out.print(res.value + " ");
            res = res.next;
        }
        System.out.println();
        res = reverseNode(pre2);
        while (res != null) {
            System.out.print(res.value + " ");
            res = res.next;
        }

    }
}

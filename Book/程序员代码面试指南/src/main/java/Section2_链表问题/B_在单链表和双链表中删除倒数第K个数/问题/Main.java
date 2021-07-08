package Section2_链表问题.B_在单链表和双链表中删除倒数第K个数.问题;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static Node reverseKnode(Node head, int K) {
        Node pre = head;
        int length = 0;
        while (head != null) {
            head = head.next;
            length++;
        }
        int tmp = 0;
        head = pre;
        while (tmp != length - K - 1) {
            head = head.next;
            tmp++;
        }
        head.next = head.next.next;
        return pre;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] strings = br.readLine().split(" ");
        int n = Integer.parseInt(strings[0]);
        int K = Integer.parseInt(strings[1]);
        strings = br.readLine().split(" ");
        Node head = new Node(Integer.parseInt(strings[0]));
        Node pre = head;
        for (int i = 1; i < n; i++) {
            head.next = new Node(Integer.parseInt(strings[i]));
            head = head.next;
        }
        Node res = reverseKnode(pre, K);
        while (res != null) {
            System.out.print(res.value + " ");
            res = res.next;
        }
    }
}

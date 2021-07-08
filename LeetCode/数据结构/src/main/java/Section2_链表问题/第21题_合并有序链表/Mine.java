package Section2_链表问题.第21题_合并有序链表;

public class Mine {
    public static void main(String[] args) {
        Mine node1 = new Mine();
        Node head = null;
        head = node1.insertNode(1, head);
        node1.insertNode(2, head);
        node1.insertNode(3, head);
        node1.insertNode(4, head);

        Mine node2 = new Mine();
        Node head2 = null;
        head2 = node2.insertNode(1, head2);
        node2.insertNode(2, head2);
        node2.insertNode(4, head2);

        System.out.println(node1.length(head));
        System.out.println(node2.length(head2));

        print(head);

    }

    public Node insertNode(int data, Node head) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
            return head;
        }
        Node curNode = head;
        while (curNode.next != null) {
            curNode = curNode.next;
        }
        curNode.next = node;
        return head;
    }

    public int length(Node head) {
        Node curNode = head;
        int length = 0;
        while (curNode != null) {
            curNode = curNode.next;
            length ++;
        }
        return length;
    }

    public static void print(Node head) {
        do{
            System.out.print(head.num+"\t");
            head = head.next;
        }while (head.next != null);
        System.out.println();
    }


}

class Node{
    Node next;
    int num;

    public Node(int num) {
        this.num = num;
    }
}


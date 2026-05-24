class Node {

    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

public class DeleteFirst {
    public static void main(String[] args) {

        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);

        head = head.next;

        while (head != null) {

            System.out.print(head.data + " -> ");

            head = head.next;
        }
    }
}
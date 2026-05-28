class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}
public class RemoveDuplicates {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(20);
        head.next.next.next = new Node(30);

        Node current = head;

        while (current != null && current.next != null) {
            if (current.data == current.next.data) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }

        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }
}
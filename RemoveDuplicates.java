class ListNode {
    int data;
    ListNode next;

    ListNode(int data) {
        this.data = data;
    }
}
public class RemoveDuplicates {
    public static void main(String[] args) {
        ListNode head = new ListNode(10);
        head.next = new ListNode(20);
        head.next.next = new ListNode(20);
        head.next.next.next = new ListNode(30);

        ListNode current = head;

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
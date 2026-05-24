class Queue {

    int front = 0;
    int rear = -1;
    int size = 5;

    int[] arr = new int[size];

    // Insert element
    void enqueue(int value) {
        if (rear == size - 1) {
            System.out.println("Queue Overflow");
        } else {
            arr[++rear] = value;
            System.out.println(value + " inserted");
        }
    }
    // Remove element
    void dequeue() {
        if (front > rear) {
            System.out.println("Queue Underflow");
        } else {
            System.out.println(arr[front++] + " removed");
        }
    }
    // Display queue
    void display() {

        for (int i = front; i <= rear; i++) {

            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }
}

public class QueueDemo {

    public static void main(String[] args) {

        Queue q = new Queue();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);
        q.enqueue(60);  // Overflow

        q.display();

        q.dequeue();

        q.display();
    }
}
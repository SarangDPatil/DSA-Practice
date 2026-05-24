class Stack {
    int top = -1;
    int size = 5;
    
    int[] arr = new int[size];
    // Push operation
    void push(int value) {
        if (top == size - 1) {
            System.out.println("Stack Overflow");
        } else {
            arr[++top] = value;
            System.out.println(value + " inserted");
        }
    }
    // Pop operation
    void pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
        } else {
            System.out.println(arr[top--] + " removed");
        }
    }
    // Peek operation
    void peek() {
        if (top == -1) {
            System.out.println("Stack Empty");
        } else {
            System.out.println("Top Element: " + arr[top]);
        }
    }
    // Display stack
    void display() {
        for (int i = top; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }
}
public class StackDemo {
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        s.display();
        s.pop();
        s.peek();
    }
}
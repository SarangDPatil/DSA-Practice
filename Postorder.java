class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
    }
}

public class Postorder {
    static void postorder(Node root) {
    if(root == null)
        return;

    postorder(root.left);
    postorder(root.right);
    System.out.print(root.data + " ");
}

    public static void main(String[] args) {

        Node root = new Node(10);

        root.left = new Node(20);
        root.right = new Node(30);

        postorder(root);
    }
}
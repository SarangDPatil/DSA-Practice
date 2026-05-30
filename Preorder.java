class Node {

    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
    }
}

public class Preorder {
    static void preorder(Node root) {
    if(root == null)
        return;

    System.out.print(root.data + " ");
    preorder(root.left);
    preorder(root.right);
}

    public static void main(String[] args) {

        Node root = new Node(10);

        root.left = new Node(20);
        root.right = new Node(30);

        preorder(root);
    }
}
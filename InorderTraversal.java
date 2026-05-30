class Node {

    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
    }
}

public class InorderTraversal {
    static void inorder(Node root) {
        if (root == null)
            return;

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {

        Node root = new Node(10);

        root.left = new Node(20);
        root.right = new Node(30);

        inorder(root);
    }
}
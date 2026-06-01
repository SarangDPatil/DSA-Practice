class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
    }
}

public class IdenticalTrees {

    static boolean identical(Node t1, Node t2) {

        if (t1 == null && t2 == null)
            return true;

        if (t1 == null || t2 == null)
            return false;

        return t1.data == t2.data &&
               identical(t1.left, t2.left) &&
               identical(t1.right, t2.right);
    }

    public static void main(String[] args) {

        Node root1 = new Node(1);
        root1.left = new Node(2);
        root1.right = new Node(3);

        Node root2 = new Node(1);
        root2.left = new Node(2);
        root2.right = new Node(3);

        System.out.println(
                identical(root1, root2)
        );
    }
}
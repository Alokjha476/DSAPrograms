package tree;

class Node {
    int data;
    Node next;
    Node prev;
}

public class BinaryTree {

    private Node root;

    public void add(int el) {
        if (root == null) {
            root = new Node();
            root.data = el;
        } else {
            Node temp = root;
        }
    }

}

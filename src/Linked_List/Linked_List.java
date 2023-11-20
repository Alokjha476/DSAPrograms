package Linked_List;
public class Linked_List {
    public static class Node {
        int data;
        Node next;

        public Node(int data) { // constructor
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    // methods
    // Add the nodes
    public void addFirstNode(int data) {
        //step 1-> create the new node
        Node newNode = new Node(data);
        size++;
        // Base Case
        if (head == null) {
            head = tail = newNode;
            return;
        }
        //step 2-> newNode next = head
        newNode.next = head;
        //step 3-> head = newNode
        head = newNode;
    }

    // add last
    public void addLast(int data) {
        // step1 create  the new node
        Node newNode = new Node(data);
        size++;
        // base case
        if (head == null) {
            head = tail = newNode;
            return;
        }
        // step2 tail.next = newNode
        tail.next = newNode;
        // step 3 tail ko bna denege new node
        tail = newNode;
    }

    public void printLl() {
        if (head == null) {
            System.out.println("LL is empty");
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void addMiddle(int index, int data) {
        if (index == 0) {
            addFirstNode(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0; // track the temp indexing
        while (i < index - 1) { // temp points prev node
            temp = temp.next;
            i++;
        }
        // i < index-1; temp --> prev
        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Remove first
    public int removeFirst() {
        // Special cases 1 ->
        if (size == 0) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }
        // case 2 ->
        else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size =0;
            return val;

        }

        int val = head.data;
        head = head.next;
        size--;
        return val;
    }
    public int removeLast() {
        if (size == 0) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        // prev : i = size-2;
        Node prev = head;
        for (int i = 0; i < size - 2; i++) {


        }
    return Integer.MIN_VALUE;
    }

    public static void main(String[] args) {
        Linked_List ll = new Linked_List();
        ll.printLl();
        ll.addFirstNode(2);
        ll.addFirstNode(1);
        ll.addLast(4);
        ll.addLast(5);
        ll.addMiddle(2, 3);
        ll.printLl();
        System.out.println(ll.size);
        ll.removeFirst();
        ll.printLl();
    }
}

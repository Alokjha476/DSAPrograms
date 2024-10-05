package interview_questions.arrays;

import Linked_List.Linked_List;

public class CreateLinkedList1 {
    // inner class
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    // Node add first position TC = O(1)

    public void addNodeInFirst(int data) {
        // create the new node
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        // new node next = head
        newNode.next = head;
        // make new node Head
        head = newNode; // link
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode; //empty
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }
    // print ll
    public void printLinkedList() {
        if (head == null) {
            System.out.println("LL is empty: ");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        CreateLinkedList1 linkedList1 = new CreateLinkedList1();
        linkedList1.addNodeInFirst(2);
        linkedList1.addNodeInFirst(1);
        linkedList1.addLast(3);
        linkedList1.addLast(4);
        linkedList1.printLinkedList();


    }

}

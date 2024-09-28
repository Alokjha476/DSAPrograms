package interview_questions.arrays;

public class CreateLinkedList1 {
    // inner class
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;


    public void addFirst(int data){
        Node newNode = new Node(data);
        if (head == null && tail == null){
            head=tail=newNode;
        }

    }

    public static void main(String[] args) {

    }

}

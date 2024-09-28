package interview_questions.arrays;

public class CreateLinkedList {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next= null;
        }
    }
        public static void main(String[] args) {
           Node node1 = new Node(1);
           Node node2 = new Node(2);
           Node node3 = new Node(3);
             // link
            node1.next = node2;
            node2.next= node3;

            Node current = node1;
            while (current != null){
                System.out.print(current.data+ "->" );
                current = current.next;
            }
            System.out.println("null");
    }
}

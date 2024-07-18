
public class DoubleLinkedlist {
    Node head;

    class Node{
        int data;
        Node prev;
        Node next;

        Node(int data){
            this.data = data;
            next =null;
            prev = null;
        }

    }

    public static void main(String[] args) {
        DoubleLinkedlist list = new DoubleLinkedlist();

        list.head = list.new Node(1);
        Node second = list.new Node(2);
        Node third = list.new Node(3);

        list.head.next = second;
        second.next = third;
        second.prev =list.head;
        third.prev = second;


        Node current = list.head;
        while (current != null){
            System.out.println(current.data + " ");
            current = current.next;
        }
        
    }
}

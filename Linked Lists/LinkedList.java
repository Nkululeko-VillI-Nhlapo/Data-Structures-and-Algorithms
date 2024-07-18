

public class LinkedList {
    Node head;

    class Node{
        int data;
        Node next;

        Node(int d){
            data = d;
            next = null;
        }

    }


    public static void main(String[] args) {
        //Create 3 nodes and set their data
        LinkedList list =   new LinkedList();
        list.head = list.new Node(1);
        Node second = list.new Node(2);
        Node third = list.new Node(3);
        Node fourth = list.new Node(4);

        //link the 3 nodes -  pointing head to poiner to second and second pointer to next
        list.head.next = second;
        second.next = third;
        third.next = fourth;

        //Print out the contents of the linked list

        Node current = list.head;
        while (current != null){
            System.out.println(current.data + " ");
            current =  current.next;
        }

    }

}
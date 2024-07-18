import javax.print.DocFlavor.INPUT_STREAM;

public class insertion{
    Node head;

    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            next = null;
        }
    }

    //A method for inserting a node at the head of the linked list
    /*public void insertAtHead(int data){
        
        Node newNode = new Node(5); //create a new node

        newNode.next = head; //Point it's pointer(of the new node) to the head
        head =newNode; //SET THE HEAD TO THE NEWNODE 


    }*/

    public static void main(String[] args) {
        insertion insert = new insertion();
        insert.head = insert.new Node(29);
        Node second = insert.new Node(345);
        Node third = insert.new Node(34);

        insert.head.next =  second;
        second.next = third;

       
        Node newNode = insert.new Node(5); //create a new node
        newNode.next  = insert.head; //point it to the head of the list
        insert.head = newNode; // set it to be the head


        Node current = insert.head;
        while (current != null){
            System.out.println(current.data + " ");
            current = current.next;
        }

        //This effectively inserts 
        //the new node at the beginning of the linked list.
    }
}
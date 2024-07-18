

public class middleInsertion {
    Node head;
    

    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            next = null;
        }
    }

    public void isertAtIndex(int index, int data){
        Node newNode = new Node(4);  //create a new node
        Node current = head; //start at the head of the linked list
        Node previous = null; //keep track of the node before the desired position;
        int count = 0; //keep track of the current postion in the list above

        //traverse the linked list to find the desired position

        while (current != null && count < index){
            previous = current;
            current = current.next;
            count++;
        }

        //insert the newNode at the desired position
        newNode.next = current;
        previous.next = newNode;
    }
}

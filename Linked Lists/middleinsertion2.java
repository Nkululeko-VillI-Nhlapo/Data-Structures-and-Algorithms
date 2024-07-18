

public class middleinsertion2 {
    Node head;

    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            next = null;
        }


    }

    public void insertAfter(Node prev_node, int newData){
        //check if the given node is null
        if (prev_node == null){
            System.out.println("Error: Previous node cannot be null");
        }

        //Create a new Node Object  &
        //Put in the data

        Node newNode = new Node(newData);

        // Assign newNode.next = prev_node.next
        newNode.next = prev_node.next;

        //Assign prev node.next to newnode

        prev_node.next = newNode;







    }
}

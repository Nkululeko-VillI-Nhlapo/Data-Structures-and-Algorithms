
//Implementation of the selection sort algo on LinkedLlists
public class selectionsort{
    Node head;

    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            next = null;
        }
    }

    public static void selectionOnLinked(Node head){{
        Node i, j, min;

        int temp;

        for (i = head; i != null; i = i.next){
            min = i;
            for ( j =i.next;  j != null; j = j.next ){
                if (j.data < min.data){
                    min = j;

                }
            }

            if (min != i){
                temp = i.data;
                i.data = min.data;
                min.data = temp;
            }



        }
    }}

    public static void main(String[] args) {
       selectionsort list = new selectionsort();

       list.head  = list.new Node(45);
       Node a  = list.new Node(5644);
       Node b  = list.new Node(12156);
       Node c  = list.new Node(6);
       Node d  = list.new Node(61);
       Node e  = list.new Node(256);

       list.head.next = a;
       a.next = b;
       b.next = c;
       c.next = d;
       d.next = e;

       Node current = list.head;
       while (current != null){
            System.out.println("Unsorted data: " +current.data + " ");
            current = current.next;
       }

       selectionOnLinked(list.head);

       Node current2 = list.head;
       while (current2 != null){
            System.out.println("Sorted data: " + current2.data + " ");
            current2 = current2.next;
       }

       


    }
}
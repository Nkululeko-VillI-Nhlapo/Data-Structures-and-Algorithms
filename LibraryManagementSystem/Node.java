/***
* Nhlapo
* Nkululeko Villicent
* 4129962
* CSC211 2023 Practical 3
* Node.java
*/

public class Node {
    private Book book;
    private Node nextNode;

    public Node() {
        book = null;
        nextNode = null;
    }

    public Node(Book book) {
        this.book = book;
        nextNode = null;
    }

    // getters to access the book inside the list and to access the next node
    public Book getBook() {
        return book;
    }
    public Node getNode() {
        return nextNode;
    }

        // setters to update the books and the nodes
    public void setBook(Book book) {
        this.book = book;
    }


    public void setNode(Node nextNode) {
        this.nextNode = nextNode;
    }

    //returns the string represenation of the book object stored in the node
    public String toString() {
        return book.toString();
    }
}
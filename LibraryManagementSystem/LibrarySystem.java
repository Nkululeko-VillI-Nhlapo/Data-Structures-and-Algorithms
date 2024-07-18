/***
* Nhlapo
* Nkululeko Villicent
* 4129962
* CSC211 2023 Practical 3
* Library Management System.java
*/

//Import Java modules and other libraries go here

import java.util.*;

public class LibrarySystem {
    private Node head;

    public LibrarySystem() {
        head = null; // initialize head to null
   }
   
   // method to insert a new book at the end of the linked list
   public void insertBook(Book newBook) {
       Node newNode = new Node(newBook); // create a new node with the book
   
       if ( head == null) { // if the list is empty, set the head to the new node
            head = newNode;
       } else { // otherwise, traverse the list to the end and add the new node
           Node currentNode =  head;
   
           while (currentNode.getNode() != null) {
               currentNode = currentNode.getNode();
           }
   
           currentNode.setNode(newNode);
       }
   
       System.out.println("Book has been successfully Added!"); // print success message
   }
   
   // method to insert a new book before a specified book ID
   public void insertBefore(Book newBook, int bookID) {
       Node newNode = new Node(newBook); // create a new node with the book
   
       if ( head == null) { // if the list is empty, set the head to the new node
            head = newNode;
           System.out.println("Book has been successfully Added!");
           return;
       }
   
       if ( head.getBook().getBookID() == bookID) { // if the head has the specified book ID, add the new node before it
           newNode.setNode( head);
            head = newNode;
           System.out.println("Book has been successfully Added!");
           return;
       }
   
       Node currentNode =  head;
   
       while (currentNode.getNode() != null && currentNode.getNode().getBook().getBookID() != bookID) { // traverse the list to find the specified book ID
           currentNode = currentNode.getNode();
       }
   
       if (currentNode.getNode() == null) { // if the book ID is not found, print error message
           System.out.println("Book not available!");
           return;
       }
   
       newNode.setNode(currentNode.getNode()); // add the new node before the specified book ID
       currentNode.setNode(newNode);
       System.out.println("Book has been successfully Added!");
   }
   
   // method to search for a book by book ID
   public Book searchBook(int bookID) {
       if ( head == null) { // if the list is empty, print error message
           System.out.println("No books found in the library!");
           return null;
       }
   
       Node currentNode =  head;
   
       while (currentNode != null && currentNode.getBook().getBookID() != bookID) { // traverse the list to find the specified book ID
           currentNode = currentNode.getNode();
       }
   
       if (currentNode == null) { // if the book ID is not found, print error message
           System.out.println("Book not available!");
           return null;
       }
   
       return currentNode.getBook(); // return the book if found
   }
   
   // method to delete a book by book ID
   public void removeBook(int bookID) {
       if ( head == null) { // if the list is empty, print error message
           System.out.println("No books found in the library!");
           return;
       }
   
       if ( head.getBook().getBookID() == bookID) { // if the head has the specified book ID, delete it
            head =  head.getNode();
           System.out.println("Book has been successfully Removed!");
           return;
       }
   
       Node currentNode =  head;
   
       while (currentNode.getNode() != null && currentNode.getNode().getBook().getBookID() != bookID) { // traverse the list to find the specified book ID
           currentNode = currentNode.getNode();
       }
   
       if (currentNode.getNode() == null) { // if the book ID is not found, print error message
           System.out.println("Book not available!");
           return;
       }
   
       currentNode.setNode(currentNode.getNode().getNode()); // delete the node with the specified book ID
       System.out.println("Book has been successfully Removed!");
   }
   
   // method to list all books in the library
   public void listAllBooks() {
       if ( head == null) { // if the list is empty, print error message
           System.out.println("No books in the library!");
           return;
       }
   
       Node currentNode =  head;
   
       while (currentNode != null) { // traverse the list and print each book
           System.out.println(currentNode.getBook().toString());
           currentNode = currentNode.getNode();
       }
   }
   
   // method to sort the books in the library by book ID
  
    public void sortLibrary() {
        if ( head == null ||  head.getNode() == null) {
            System.out.println("No book to sort!");
            return;
        }
    
        boolean sorted = false;
    
        while (!sorted) {
            sorted = true;
            Node currentNode =  head;
            Node previousNode = null;
  
            
            //Swap adjacent books if they are not in order
            while (currentNode.getNode() != null) {
                Node nextNode = currentNode.getNode();
                if (currentNode.getBook().getBookID() > nextNode.getBook().getBookID()) {
                    sorted = false;
    
                    // Swap currentNode and nextNode
                    if (previousNode == null) {
                         head = nextNode;
                    } else {
                        previousNode.setNode(nextNode);
                    }
                    currentNode.setNode(nextNode.getNode());
                    nextNode.setNode(currentNode);
    
                    previousNode = nextNode;
                } else {
                    previousNode = currentNode;
                    currentNode = nextNode;
                }
            }
        }
    
       
    }

    //Returns total number of books in a linked list
    public int totalBooks() {
        int tally = 0;
        Node currentNode = head;
        // Traverse the linked list and count the number of nodes
        while (currentNode != null) {
            tally++;
            currentNode = currentNode.getNode();
        }
    
        return tally;
    }

    public static void main(String[] args) {
        //   Different Libary menu Options
        LibrarySystem library = new LibrarySystem();
        Scanner UserScanner = new Scanner(System.in);
        int menuOption;
        do {
            System.out.println("<<<<<!>LIBRARY SYSTEM MENU<!>>>>>");
            System.out.println("1. Add a book");
            System.out.println("2. Add a book before a book ID");
            System.out.println("3. Search for a book by book ID");
            System.out.println("4. Delete a book by book ID");
            System.out.println("5. List all the books");
            System.out.println("6. Sort books by book ID");
            System.out.println("7. Get the total number of  books");
            System.out.println("0. Exit the Sytem");

            System.out.print("Enter your Option: "); //select any number on the menuu
            menuOption = UserScanner.nextInt();

            switch (menuOption) {
                case 1:
                    System.out.println("Provide book information:"); 
                    System.out.print("Book ID: ");
                    int bookID = UserScanner.nextInt();
                    System.out.print("Book title: ");
                    UserScanner.nextLine();
                    String title = UserScanner.nextLine();
                    System.out.print("Book authorName: ");
                    String author = UserScanner.nextLine();
                    System.out.print("Book publisher: ");
                    String publisher = UserScanner.nextLine();
                    
                    Book newBook = new Book(bookID, title, author, publisher);
                    library.insertBook(newBook);
                    
                    break;
                case 2:
                    System.out.println("Provide book information:");
                    System.out.print("Book ID: ");
                    bookID = UserScanner.nextInt();
                    System.out.print("Book title: ");
                    UserScanner.nextLine();
                    title = UserScanner.nextLine();
                    System.out.print("Book authorName: ");
                    author = UserScanner.nextLine();
                    System.out.print("Book Publsiher: ");
                    publisher =UserScanner.nextLine();
                    
                    
                    newBook = new Book(bookID, title, author, publisher);
                    System.out.print("Provide the book ID to insert before: ");
                    int beforeID =UserScanner.nextInt();
                    library.insertBefore(newBook, beforeID);
                    
                    break;
                case 3:
                    System.out.print("Provide book ID to search: ");
                    bookID =UserScanner.nextInt();
                    Book searchResult = library.searchBook(bookID);
                    if (searchResult != null) {
                        System.out.println("Search result:");
                        System.out.println(searchResult.toString());
                    } else {
                        System.out.println("Book not available.");
                    }
                    break;
                case 4:
                    System.out.print("Provide book ID to delete: ");
                    bookID =UserScanner.nextInt();
                    library.removeBook(bookID);
                    break;
                case 5:
                    library.listAllBooks();
                    break;
                case 6:
                    library.sortLibrary();
                    System.out.println("Books have been successfully sorted!");
                    break;
                case 7:
                    int total = library.totalBooks();
                    System.out.println("Number of books in total: " + total);
                    break;
                case 0:
                    System.out.println("Leaving the library system......");
                    break;
                default:
                    System.out.println("Please try again, You have Provided an invalid option!!");
                    break;
            }
            System.out.println();
        } while (menuOption != 0);
    }
} 
 

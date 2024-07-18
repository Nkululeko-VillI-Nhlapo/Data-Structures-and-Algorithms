/***
* Nhlapo
* Nkululeko Villicent
* 4129962
* CSC211 2023 Practical 3
* Book.java
*/
// This is the constructor of the Book class which initializes the instance variables.
public class Book {
    private int bookID;
    private String title;
    private String authorName;
    private String publisher;

    // This is the constructor of the Book class which initializes the instance variables.
    public Book(int bookID, String title, String author, String publisher) {
        this.bookID = bookID;
        this.title = title;
        this.authorName = author;
        this.publisher = publisher;
    }

   
    //Setter methods to set book if any
    public void setBookID(int bookID) {
        this.bookID = bookID;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.authorName = author;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    //getter methods to access the books
    public int getBookID() {
        return bookID;
    }


    public String getTitle() {
        return title;
    }

    

    public String getAuthor() {
        return authorName;
    }

    

    public String getPublisher() {
        return publisher;
    }

    

 
    //change Book Objects to string so that they can be displayed
    public String toString() {
        return "Book ID: " + bookID + ", Title: " + title + ", Author: " + authorName +
                ", Publisher: " + publisher ;
    }
}
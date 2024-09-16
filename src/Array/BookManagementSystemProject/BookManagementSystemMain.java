package Array.BookManagementSystemProject;

public class BookManagementSystemMain {


    public static void main(String[] args) {
        BookManagementSystem system = new BookManagementSystem("Java", "Asma", "456", 1);
        System.out.println("*************************************");
        System.out.println("WelCome to my Book Management System");

        // add book to the sys
        // Add a book to the system
        system.addBook("Java", "Asma", "1234", 12);
        system.addBook("Database", "Fayza", "2234", 22);

        // Display all books in the system
        for (int i = 0; i < BookManagementSystem.bookCount; i++) {
            System.out.println("Title: " + BookManagementSystem.books[i].title + ", Author: " + BookManagementSystem.books[i].author +
                    ", ISBN: " + BookManagementSystem.books[i].isbn + ", Copies: " + BookManagementSystem.books[i].copies);
        }

        // Find the book by ISBN , handle checkout, check-in, and display details as well
        system.findBookByISBN("1234");
        system.findBookByISBN("2234");


    }
}




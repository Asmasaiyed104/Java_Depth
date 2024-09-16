package Assignments.Assignment3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Example of using the system
        System.out.println("*********************************************");
        System.out.println("*** Welcome to my Library Management System ***");

        // object reference creted library, we can created object into heap memory

        LibraryManagementSystem  library = new LibraryManagementSystem();

        // Add books with reference name library , add data with help of reference object library
        library.addBook ("Java", "Asma", "1234", 12);
        library.addBook ("Database", "Fayza", "2234", 22);
        library.addBook("Linux", "Nouman", "3345", 23);

        // Add members data into library reference
        library.addMember ("Asma");
        library.addMember("Fayza");
        library.addMember("Nouman");

        // Display all books
        library.displayAllBooks ();

        // Display all members
        library.displayAllMembers();

        // Search for a book by title
        System.out.println("Enter the title to search  : ");
        String title = scanner.nextLine();

        library.searchBooksByTitle(title);

        // Search for a book by author
        System.out.println("Enter   author to search  :");
        String author = scanner.nextLine();
        library.searchBooksByAuthor(author);

        // Checkout a book
        System.out.println("Enter for book isbn to  check out:");

        String isbn = scanner.nextLine();

        // Find the book by ISBN and perform the checkout
        int bookIndex = library.findBookByISBN(isbn);

        if (bookIndex != -1)  {
            library.checkOutBookIndex (bookIndex);
        }

        // Reserve a book
        System.out.println("Enter the ISBN of the book to reserve :");

        String reserveIsbn = scanner.nextLine();

        library.reserveBook(reserveIsbn);

        scanner.close();
    }
}

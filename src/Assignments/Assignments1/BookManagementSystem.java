
/*  BookManagementSystem
Author: Asma Saiyed
*
*
* */

package Assignments.Assignments1;


public class BookManagementSystem {

    String title;
    String author;
    String isbn;
    int copies;

    // this is final and static so the maximum number of books you can store is 100
    // you cannot change the value  throughout the program
    static final int max_bookStore = 100;

    // array to store the books
    static BookManagementSystem[] books = new BookManagementSystem[max_bookStore];

    // i need to add counter so whenever a book is  added to bookmanagement system,
    // it will increment by itself. i will store the  book count into int bookCount,
    // initialized to zero

    static int bookCount = 0;

    //constructor
    // it is used to initialize the object
    // it has same name if class and  no return value


    public BookManagementSystem(String title, String author, String isbn, int copies) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.copies = copies;
    }
    // method to add book into then bookmannagement system


    public void addBook(String title, String author, String isbn, int copies) {
        /* it will increment the bookCount counter, so i added bookCount
        to the array of books(my bookmanagement system array name is book)
         it will print a message if the book is added
         it will check the condition(if true), then go to the constructor to initialize
        title,author,isbn, & copies, after adding all the value to the object
        it increments the count, so bookCount is now 1, then it will got add to add the book
        into the system. bookcount  is used  in a for loop to add the book into system
        */

        if (bookCount < max_bookStore) {

            books[bookCount] = new BookManagementSystem(title, author, isbn, copies);
            bookCount++;
            System.out.println("Book added :" + title);

        } else {
            System.out.println("Not added");
        }
    }
     /*FINDBOOKBYISBN
     *Author : Asma
      * here findBookByISBN will find book by comparing isbn string character that is  stored.
       so if two string characters are  equals then
      it will retun index , if not matched then it will return -1
    */

    public int findBookByISBN(String isbn) {
        for (int i = 0; i < bookCount; i++) {

            if (books[i].isbn.equals(isbn)) {
                System.out.println("Book found:");
                System.out.println("Title: " + books[i].title);
                System.out.println("Author: " + books[i].author);
                System.out.println("ISBN: " + books[i].isbn);
                System.out.println("Available Copies: " + books[i].copies);

                // Return the index of the found book
                return i;
            }
        }
        System.out.println("Book with ISBN " + isbn + " not found.");

        // Return -1 if the book is not found
        return -1;
    }
    public void checkOutBookIndex(int bookIndex){
        // i stored my bookindex in the  books aaray object, so if the copies of book is more than or equal 0 index, && also book index less than bookCount
        // if coipes  decrement with -- so if i sout,to see title , so no copies avalible
        if(bookIndex >= 0 && bookIndex < bookCount) {
            if (books[bookIndex].copies > 0) {
                books[bookIndex].copies--;
                System.out.println("Check out" + books[bookIndex].title);
            } else {
                System.out.println("No copies available for checkout");
            }
        }
        else{
            System.out.println("No valid index");

        }
    }

    public void checkInBookIndex(int bookIndex){
        // if bookIndex is greter or equal  and zero, my books index is less thant my int bookcout so,
        // copes will incremnet if  added so during check in we can see by sout  check in
        if(bookIndex >= 0 && bookIndex < bookCount){
            books[bookIndex].copies++;
            System.out.println("Check IN" + books[bookIndex].title);
        } else {
            System.out.println("Invalid book index");
        }

    }
    // it is simple just book  check condition and display whatever i want to print titile , author , isbn and available book index
    public  void displayBookDetails(int bookIndex){
        if(bookIndex >=0 && bookIndex <bookCount){

            System.out.println("Title : " + books[bookIndex].title);
            System.out.println("Author : " +books[bookIndex].author);
            System.out.println("ISBN : " + books[bookIndex].isbn);
            System.out.println("Available Copies : " + books[bookIndex].copies);
        } else {
            System.out.println("Invalid book index");
        }
    }
}


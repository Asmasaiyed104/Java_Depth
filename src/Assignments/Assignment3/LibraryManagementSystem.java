package Assignments.Assignment3;


public class LibraryManagementSystem {
    /*Author : Asma saiyed
     * */

    // properties
    // this is for book
    String bookTitle;
    String bookAuthor;
    String bookISBN;
    int bookCopies;

    // this is for member
    int memberId;
    String memberName;

    static final int MAX_BOOKS = 100;
    static final int MAX_MEMBERS = 100;

    //array
    // first go to the libraray object, then check array of object where i stored books( in which i stored constant max book 100),it will count with bookCount, then initialize with constructor
    static LibraryManagementSystem[] books = new LibraryManagementSystem[MAX_BOOKS];
    static LibraryManagementSystem[] members = new LibraryManagementSystem[MAX_MEMBERS];

    //counters
    static int bookCount = 0;
    static int memberCount = 0;

    // constructor
    //
    public LibraryManagementSystem() {

    }

    // for initialize book instance constructor
    public LibraryManagementSystem(String bookTitle, String bookAuthor, String bookISBN, int bookCopies) {
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
        this.bookISBN = bookISBN;
        this.bookCopies = bookCopies;
    }

    // for mrm constructor
    public LibraryManagementSystem(String memberName) {
        //this.memberId = nextMemberId++;
        this.memberName = memberName;
    }

    //method
    /* intialize with member constructor,add member after check condition , added memberes one by one asma,fayza, nouman
    every time for adding memner when method call into main static class, it will initialize with constructor , check condition, add it
    * */
    public static void addMember(String memberName) {
        if (memberCount < MAX_MEMBERS) {
            members[memberCount] = new LibraryManagementSystem(memberName);
            memberCount++;
            System.out.println("Member added : " + memberName);
        } else {
            System.out.println("Cannot add more members.");
        }
    }
    /* when method call into main class, it will come to check method class displaying all memebers  ,
    whetever added , member counted
    * */
    public static void displayAllMembers() {
        System.out.println("Displaying all members:");
        for (int i = 0; i < memberCount; i++) {
            System.out.println("Name : " + members[i].memberName + ", Member ID : " + members[i].memberId);
        }
    }
    /*
     * after initialize with instance of object, for addBook it will come to access addBook method,
     * the initialize with book constructor to add parameters, the with help of it , it will add book one by one all until
     * condition true, if condition false , it will executes*/
    public static void addBook(String bookTitle, String bookAuthor, String bookISBN, int bookCopies) {
        if (bookCount < MAX_BOOKS) {
            books[bookCount] = new LibraryManagementSystem(bookTitle, bookAuthor, bookISBN, bookCopies);
            bookCount++;
            System.out.println("Book added: " + bookTitle);
        } else {
            System.out.println("Cannot add more books.");
        }
    }

    public static void displayAllBooks() {
        System.out.println(" Displaying all books :");
        for (int i = 0; i < bookCount; i++) {
            System.out.println("Title : " + books[i].bookTitle + ", Author : " + books[i].bookAuthor +
                    ", ISBN : " + books[i].bookISBN + ", Copies : " + books[i].bookCopies);
        }
    }
    /* when method calls, it will come and check condition with boolean, is it fakse if if book title not match , but true if it is match
     * */
    public static void searchBooksByTitle(String bookTitle) {
        boolean found = false;
        for (int i = 0; i < bookCount; i++) {
            if (books[i].bookTitle.equals(bookTitle)) {
                System.out.println("Found book : Titel :" + books[i].bookTitle + ", Author : " + books[i].bookAuthor + ", ISBN : " + books[i].bookISBN + ", Copies : " + books[i].bookCopies);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No book found" + bookTitle);
        }


    }
    // same like above condition will check if bookauthor content of string, same to serching bookauthor if condition true , book founded, false then not founded
    public static void searchBooksByAuthor(String bookAuthor) {
        boolean found = false;
        for (int i = 0; i < bookCount; i++) {
            if (books[i].bookAuthor.equals(bookAuthor)) {
                System.out.println("Found book : Title :" + books[i].bookTitle + ", Author : " + books[i].bookAuthor + ", ISBN : " + books[i].bookISBN + ", Copies : " + books[i].bookCopies);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No book found" + bookAuthor);
        }


    }
    public void checkOutBookIndex(int bookIndex){
        // i stored my bookindex in the  books aaray object, so if the copies of book is more than or equal 0 index, && also book index less than bookCount
        // if coipes  decrement with -- so if i sout,to see title , so no copies avalible
        if(bookIndex >= 0 && bookIndex < bookCount) {
            if (books[bookIndex].bookCopies > 0) {
                books[bookIndex].bookCopies--;
                System.out.println("Check out" + books[bookIndex].bookTitle);
            } else {
                System.out.println("No copies available for checkout");
            }
        }
        else{
            System.out.println("No valid index");

        }
    }
    /*
     * same like above with .equal method of string, it will compare content of string if
     * it is found  return init i and not found return -1  because here i initialize with 0*/
    public int findBookByISBN(String isbn) {
        for (int i = 0; i < bookCount; i++) {

            if (books[i].bookISBN.equals(isbn)) {
                System.out.println("Book found:");
                System.out.println("Title: " + books[i].bookTitle);
                System.out.println("Author: " + books[i].bookAuthor);
                System.out.println("ISBN: " + books[i].bookISBN);
                System.out.println("Available Copies: " + books[i].bookCopies);

                // Return, if the index of the found book
                return i;
            }
        }
        System.out.println("Book with ISBN " + isbn + " not found.");

        // Return   -1 , if the  book is not found
        return -1;
    }

    public static void reserveBook(String bookISBN) {

        System.out.println("Book reserved with ISBN: " + bookISBN);
    }
}

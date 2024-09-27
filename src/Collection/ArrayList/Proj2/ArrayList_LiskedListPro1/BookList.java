package Collection.ArrayList.Proj2.ArrayList_LiskedListPro1;

import java.util.ArrayList;
import java.util.LinkedList;

public class BookList {
    public static void main(String[] args) {
        ArrayList<String >fictionBook = new ArrayList();
        fictionBook.add("Pride and Prejudice");
        fictionBook.add("The Symboll");
        fictionBook.add(1,"Brave New world");
        fictionBook.remove("The Symboll");
        System.out.println("Fiction Book");
         for(String books : fictionBook)
        System.out.println( books);
        System.out.println("---------------------------");


        LinkedList<String>nonFictionBook =new LinkedList<>();
        nonFictionBook.add("The 80/20 Principle");
        nonFictionBook.add("The 7 Habits of Highly Effective people");
        nonFictionBook.add("The miracle Morning");
        System.out.println("Non Fiction Book");
        for(String booknf : nonFictionBook)
            System.out.println(booknf);
    }


}

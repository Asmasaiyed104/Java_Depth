package Enum;
import java.time.Month;
public class Abc {
    enum CustomMonth {
        JAN, FEB, MAR;
    }
    public static void main(String[] args) {
        for (Month m : Month.values())
            System.out.println(m);

//        System.out.println(Month.valueOf("JAN"));
//        System.out.println(Month.valueOf("Feb"));
//        System.out.println(Month.valueOf("MAR"));
        System.out.println(Month.valueOf("JANUARY").ordinal());
        // Using custom enum
        System.out.println(CustomMonth.valueOf("JAN"));
        System.out.println(CustomMonth.valueOf("FEB"));
        System.out.println(CustomMonth.valueOf("MAR"));



    }

}
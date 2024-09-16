package Enum.MethodBydefault;

public class NameMethod {

    enum Day{
        // i declare enum day with three constant
        // these three  are instance of the day enum
        // they are implicitely static final menas they can't change

        Monday,Tuesday,Wednesaday;
    }

    public static void main(String[] args) {
        Day day = Day.Monday;
        System.out.println(day.name());
    }
}
/*
JVM
1. stored -method area
* Day day = Day.Monday; , create object of day (doesnt need new)
* */

package Enum.MethodBydefault;

public class ValueOfMethod {
    enum Day{
        Monday,Tuesday,Wednesday;
    }

    public static void main(String[] args) {
        Day day = Day.valueOf("Wednesday");
        System.out.println(day);
    }
}

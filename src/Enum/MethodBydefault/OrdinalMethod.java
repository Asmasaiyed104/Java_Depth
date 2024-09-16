package Enum.MethodBydefault;

public class OrdinalMethod {
    enum Day{
        Monday,Tuesday,Wednesday;
    }

    public static void main(String[] args) {
        Day day1 = Day.Tuesday;
        Day day2 = Day.Wednesday;
        System.out.println(day1.ordinal());
        System.out.println(day2.ordinal());
    }
}

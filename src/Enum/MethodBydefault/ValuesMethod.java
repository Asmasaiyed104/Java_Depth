package Enum.MethodBydefault;

public class ValuesMethod {
    enum Day {
        Monday, Tuesday, Wednesday;

    }

    public static void main(String[] args) {
        for (Day day : Day.values()) {
            System.out.println(day);
        }
    }
}

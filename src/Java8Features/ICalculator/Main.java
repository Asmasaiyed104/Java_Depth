package Java8Features.ICalculator;

public class Main {
    public static void main(String[] args) {
        CalculateImpl calculator = new CalculateImpl();
        calculator.calculate();
        calculator.play();

        // Using a lambda expression for the Work interface
        Work work = (n, r) -> System.out.println("name " + n + " is working for " + r);
        work.doWork("Asma", 50);

        // Using a method reference to refer to the haveFun method
        Work fun = Main::haveFun;
        fun.doWork("Ashwini", 100);
    }

    // Static method to be referenced
    static void haveFun(String name, double funMoney) {
        System.out.println("name " + name + " is having fun with money " + funMoney);
    }
}
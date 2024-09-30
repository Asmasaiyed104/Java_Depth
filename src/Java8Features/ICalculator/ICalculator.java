package Java8Features.ICalculator;
@FunctionalInterface
public interface ICalculator {
    int a = 10;
    int b = 35;

    // Single abstract method
    void calculate();

    // Default method
    default void play() {
        System.out.println("Playing");
    }
    // other default
    default int add(int a, int b) {
        return a + b;
    }
    default int subtract(int a, int b) {
        return a - b;
    }
    default int multiply(int a, int b) {
        return a * b;
    }
}

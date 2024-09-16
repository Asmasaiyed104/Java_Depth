package Assignments.Assignment4;

public class Donut extends TimsConsumer{

    private double price;
    private int calories;

    public Donut(double price, int calories) {
        this.price = price;
        this.calories = calories;
    }

    @Override
    double getPrice() {
        return 0;
    }

    @Override
    public int getCalories() {
        return 0;
    }
}

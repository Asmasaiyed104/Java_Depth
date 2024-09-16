package Assignments.Assignment4;

public abstract class TimsItem {

    abstract double getPrice();

    @Override
    public String toString() {
        return "Item: " + this.getClass().getSimpleName() + " Price: $" + getPrice();
    }
}
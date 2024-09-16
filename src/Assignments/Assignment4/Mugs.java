package Assignments.Assignment4;

public class Mugs extends TimsMerchandise {

    private double price;
    private String feature;

    public Mugs(String feature, double price) {
        this.feature = feature;
        this.price = price;
    }

    @Override
    double getPrice() {
        return 0;
    }

    @Override
    public String getFeatures() {
        return "";
    }
}


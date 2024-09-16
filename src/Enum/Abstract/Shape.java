package Enum.Abstract;

public enum Shape {
    CIRCLE {
        public double area() {
            // eq= pi-r-square
            return Math.PI * 3 * 3;
        }
    },
    SQUARE {
        public double area() {
            //area of square with side
            return 4 * 4;
        }
    };
    // Abstract method
    public abstract double area();

    }


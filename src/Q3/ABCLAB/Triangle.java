package Q3.ABCLAB;

public class Triangle extends NotCircle {
    private final double base;

    // Right Triangle lol

    public Triangle(double h, double w) {
        height = h;
        base = w;
    }

    public void calcArea() {
        System.out.println("Area: " + (0.5 * base * height));
    }

    public void calcPerim() {
        double hype = Math.sqrt(Math.pow(base, 2) + Math.pow(height, 2));
        System.out.println("Perimeter: " + (hype + base + height));
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double h) {
        height = h;
    }


}

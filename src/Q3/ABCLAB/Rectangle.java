package Q3.ABCLAB;

public class Rectangle extends NotCircle {

    private final double width;

    public Rectangle(double h, double w) {
        height = h;
        width = w;
    }

    public void calcArea() {
        System.out.println("Area: " + (width * height));
    }

    public void calcPerim() {
        System.out.println("Perimeter: " + (2 * width + 2 * height));
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double h) {
        height = h;
    }


}

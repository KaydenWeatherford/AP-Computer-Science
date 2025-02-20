package Q3.prog703s;

public class Apple extends OS {
    private final String color;

    public Apple(String name, int number, double value, String kolorz) {
        super(name, number, value);
        color = kolorz;
    }

    public String getColor() {
        return color;
    }
}

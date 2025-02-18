package Q3.prog702q;

public class Car extends Vietcongle {
    private final String type;

    public Car(String name, int tires, double val) {
        super(name, tires, val);
        type = "Car";
    }

    public String getType() {
        return type;
    }
}

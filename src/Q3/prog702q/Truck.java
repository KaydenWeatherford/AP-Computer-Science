package Q3.prog702q;

public class Truck extends Vietcongle {
    private final String type;

    public Truck(String name, int tires, double miles) {
        super(name, tires, (50000 - (0.25 * miles)));
        type = "Truck";
    }

    public String getType() {
        return type;
    }
}
